package org.galactic.empire.secret.software.licensing.logicTest;

import static org.junit.jupiter.api.Assertions.*;

import org.galactic.empire.secret.software.licensing.data.License;
import org.galactic.empire.secret.software.licensing.exceptions.LMException;
import org.galactic.empire.secret.software.licensing.logic.LicenseManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UpdateLicenseTest {
	private LicenseManager myLicenseManager;
	private String jsonFilesFolder;
	
	public UpdateLicenseTest () {
		jsonFilesFolder = System.getProperty("user.dir") + "/JSONFiles/UpdateLicense/";
		myLicenseManager = LicenseManager.getInstance();
	}
	
	@DisplayName("Todo funciona OK")
	@Test
	void testTodoOK() throws LMException {
		String FilePath = this.jsonFilesFolder + "TodoOK.json";
		String expected = null;
		String obtained=null;
		try{
		String obtainedLicense = this.myLicenseManager.UpdateLicense(FilePath,30);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Menos de 64 Bits")
	@Test
	void testMenosBits() throws LMException {
		String FilePath = this.jsonFilesFolder + "MenosBits.json";
		String expected = "Error: invalid String format for license key.";
		String obtained=null;
		try{
			String obtainedLicense = this.myLicenseManager.UpdateLicense(FilePath,30);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Más de 64 Bits")
	@Test
	void testMasBits() throws LMException {
		String FilePath = this.jsonFilesFolder + "MasBits.json";
		String expected = "Error: invalid String format for license key.";
		String obtained=null;
		try{
			String obtainedLicense = this.myLicenseManager.UpdateLicense(FilePath,30);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	
	@DisplayName("El campo LICENSEHASH no existe")
	@Test
	void testNoHash() throws LMException {
		String FilePath = this.jsonFilesFolder + "NoHash.json";
		String expected = "Error: invalid String format for license key.";
		String obtained=null;
		try{
			String obtainedLicense = this.myLicenseManager.UpdateLicense(FilePath,30);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Formato de LICENSEHASH incorrecto")
	@Test
	void testFormato() throws LMException {
		String FilePath = this.jsonFilesFolder + "Formato.json";
		String expected = "Error: invalid String format for license key.";
		String obtained=null;
		try{
			String obtainedLicense = this.myLicenseManager.UpdateLicense(FilePath,30);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
}
