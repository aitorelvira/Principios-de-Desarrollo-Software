package org.galactic.empire.secret.software.licensing.data;

import org.galactic.empire.secret.software.licensing.exceptions.LMException;
import org.galactic.empire.secret.software.licensing.utils.SHA256Hasher;

public class License {
	
	private LicenseRequest LicenseRequestData;
	private String signature;
	public int days;
	public Boolean active=true;
	
	public License (LicenseRequest licenseRequest, int days) throws LMException {
		this.LicenseRequestData = licenseRequest;
		SHA256Hasher mySignatureGenerator = new SHA256Hasher();
		this.signature = mySignatureGenerator.generateHash(this.LicenseRequestData.getStationName() + ";" + this.LicenseRequestData.getMachineName() + ";" + this.LicenseRequestData.getPersoninCharge() + ";" + this.LicenseRequestData.getEmail() + ";" + this.LicenseRequestData.getTypeofLicense()+ ";" + this.LicenseRequestData.getUUID());
		this.days = days;
	}

	public License (String stationName, String personInCharge, String eMail, String machineName, String typeOfLicense, String licenseSignature) throws LMException {
		this.LicenseRequestData = new LicenseRequest (personInCharge, eMail, machineName, typeOfLicense);
		this.signature = this.verifySignature(licenseSignature);
	}
	
	//Nuevo constructor
	public License (String stationName, String personInCharge, String eMail, String machineName, String typeOfLicense, String RequestDate, String UUID, String LicenseHash) throws LMException {
		this.LicenseRequestData = new LicenseRequest (personInCharge, eMail, machineName, typeOfLicense);
		this.signature = this.verifySignature(getSignature());
	}
	
	
	public License(String string) throws LMException {
		this.signature=this.verifySignature(string);
	}

	private String verifySignature (String signature) throws LMException {
		// Format check for license format (length and hex values)
		if (signature.length() != 64 || !signature.matches("-?[0-9a-fA-F]+")) {
			throw new LMException("Error: invalid String format for license key.");	
		}
		return signature;
	}
	
	public String getStationName() {
		return this.LicenseRequestData.getStationName();
	}
	
	public String getMachineName() {
		return this.LicenseRequestData.getMachineName();
	}
	
	public String getPersonInCharge() {
		return this.LicenseRequestData.getPersoninCharge();
	}
	
	public String getEMail () {
		return this.LicenseRequestData.getEmail();
	}
	
	public String getTypeOfLicense () {
		return this.LicenseRequestData.getTypeofLicense();
	}
	
	public long getRemainingDays () {
		long finalDate = this.LicenseRequestData.getrequestDate() + this.days*87400;
		long today  = System.currentTimeMillis(); 
		return finalDate - today;
	}
	
	public String getSignature() {
		return signature;
	}
	
	public boolean IsValid () {
		long finalDate = this.LicenseRequestData.getrequestDate() + this.days*86400000;
		long today  = System.currentTimeMillis(); 
		long remainingDays = finalDate - today;
		if (remainingDays>=0 && active==false) {
			return true;	
		}
		else {
			return false;
		}
	}

}