package org.galactic.empire.secret.software.licensing;

import org.galactic.empire.secret.software.licensing.data.LicenseRequest;
import org.galactic.empire.secret.software.licensing.exceptions.LMException;

public interface iLicenseManager {
	LicenseRequest RequestLicense (String InputFile) throws LMException;
	// LicenseRequest represents LM-RF-01-S1
	// String InputFile represents LM-RF-01-E1
	// LMException represents LM-RF-01-S2
	
	String GenerateLicense (String InputFile, int days) throws LMException;
	// String represents LM-RF-02-S1
	// String InputFile represents LM-RF-02-E1
	// int days represents LM-RF-02-E2
	// LMException represents LM -RF-02-S2
	
	boolean VerifyLicense (String LicenseFilePath) throws LMException;
	//boolean represents LM-RF-03-S1
	//String LicenseFilePath represents LM-RF-03-E1
	//LMException represents LM -RF-03-S2
}


