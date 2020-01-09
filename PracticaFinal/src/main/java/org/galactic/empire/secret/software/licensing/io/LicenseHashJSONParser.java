package org.galactic.empire.secret.software.licensing.io;

import javax.json.JsonObject;

import org.galactic.empire.secret.software.licensing.data.License;
import org.galactic.empire.secret.software.licensing.exceptions.LMException;

import org.galactic.empire.secret.software.licensing.io.JSONParser;
import org.galactic.empire.secret.software.licensing.io.iJSONParser;

public class LicenseHashJSONParser extends JSONParser implements iJSONParser {
	
	public LicenseHashJSONParser () {
		String[] myAcceptedLabels = {"LicenseHash"};
		this.acceptedLabels = myAcceptedLabels;
	}
	
	public Object Parse (String FilePath) throws LMException {
		JsonObject jsonLicenseRequest = (JsonObject)super.Parse(FilePath);
		this.checkLabels(jsonLicenseRequest);
		License myLicense = null;
		String[] values = this.getJsonStringValuesfromJson(jsonLicenseRequest);
		myLicense = new License(values[0]);
		return myLicense;	
	}
}

