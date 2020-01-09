package org.galactic.empire.secret.software.licensing.logic;


import org.galactic.empire.secret.software.licensing.iLicenseManager;
import org.galactic.empire.secret.software.licensing.data.License;
import org.galactic.empire.secret.software.licensing.data.LicenseRequest;
import org.galactic.empire.secret.software.licensing.exceptions.LMException;
import org.galactic.empire.secret.software.licensing.io.InitialLicenseRequestJSONParser;
import org.galactic.empire.secret.software.licensing.io.LicenseHashJSONParser;
import org.galactic.empire.secret.software.licensing.io.LicenseJSONParser;
import org.galactic.empire.secret.software.licensing.io.LicenseRequestJSONParser;
import org.galactic.empire.secret.software.licensing.io.LicenseSwitchOffJSONParser;
import org.galactic.empire.secret.software.licensing.store.LicensesStore;

public class LicenseManager implements iLicenseManager {

	private static LicenseManager manager;
	private LicensesStore myStore;
	
	private LicenseManager () {
		 myStore = LicensesStore.getInstance();
	}
	
	public static LicenseManager getInstance () {
		if (manager == null) {
			manager = new LicenseManager();
		}
		else {
			System.out.println("There is a LicenseManager object already created");
		}
		return manager;
	}
	
	@Override
	public LicenseManager clone () {
		try {
			throw new CloneNotSupportedException();
		}
		catch (CloneNotSupportedException ex) {
			System.out.println("License Manager Object cannot be cloned");
		}
		return null;
	}
	
	public LicenseRequest RequestLicense(String InputFile) throws LMException {
		InitialLicenseRequestJSONParser myParser = new InitialLicenseRequestJSONParser();
		LicenseRequest myLicenseRequest = (LicenseRequest) myParser.Parse(InputFile);
		return myLicenseRequest;
	}

	public String GenerateLicense(String InputFile, int days) throws LMException {
		LicenseRequestJSONParser myParser = new LicenseRequestJSONParser();
		LicenseRequest myLicenseRequest = (LicenseRequest) myParser.Parse(InputFile);
		License myGeneratedLicense = new License  (myLicenseRequest, days);
		myStore.Add(myGeneratedLicense);
		return myGeneratedLicense.getSignature();
	}
	
	public boolean VerifyLicense(String LicenseFilePath) throws LMException {
		boolean result = false;
		LicenseJSONParser myParser = new LicenseJSONParser();
		License licenseToVerify = (License) myParser.Parse(LicenseFilePath);
		License licenseFound = myStore.Find(licenseToVerify);
		if (licenseFound!=null){
			result = licenseFound.IsValid();
		}
		return result;
	}
	
	
	
	
	
	
	
	public License SwitchOffLicense (String path) throws LMException{
		LicenseSwitchOffJSONParser licHash=new LicenseSwitchOffJSONParser();
		License switchedOff=(License) licHash.Parse(path);
		License found=myStore.Find(switchedOff);
			if(found!=null) {
				myStore.RemoveFromList(found);
				switchedOff.active=false;
				myStore.Add(found);
				
			}else {
				throw new LMException("Error: License not found.");
			}
		return switchedOff;
		
}
	
	public License RevokeLicense (String path) throws LMException{
		LicenseHashJSONParser licHash=new LicenseHashJSONParser();
		License revoked=(License) licHash.Parse(path);
		License found=myStore.FindLicenseHash(revoked);
			if(found!=null) {
				myStore.RemoveFromList(found);
			}else {
				throw new LMException("Error: License not found.");
			}
		return found;
	}
	
	
	public String UpdateLicense (String path, int dias) throws LMException{
		LicenseHashJSONParser licHash=new LicenseHashJSONParser();
		License updated=(License) licHash.Parse(path);
		License found=myStore.FindLicenseHash(updated);
		String hash=found.getSignature();	
			if(dias<=0) {
				throw new LMException("Error: format not valid.");
			}
			else {
			if(found!=null) {
				myStore.RemoveFromList(found);
				found.days=found.days+dias;
				myStore.Add(found);
			}else {
				throw new LMException("Error: License not found.");
			}
		}
		return hash;
	}

}