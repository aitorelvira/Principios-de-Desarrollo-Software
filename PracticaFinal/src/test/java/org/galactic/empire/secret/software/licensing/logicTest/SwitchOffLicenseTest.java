package org.galactic.empire.secret.software.licensing.logicTest;

import static org.junit.jupiter.api.Assertions.*;

import org.galactic.empire.secret.software.licensing.data.License;
import org.galactic.empire.secret.software.licensing.exceptions.LMException;
import org.galactic.empire.secret.software.licensing.logic.LicenseManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SwitchOffLicenseTest {

	
	private LicenseManager myLicenseManager;
	private String jsonFilesFolder;
	
	public SwitchOffLicenseTest () {
		jsonFilesFolder = System.getProperty("user.dir") + "/JSONFiles/SwitchOffLicense/";
		myLicenseManager = LicenseManager.getInstance();
	}
	
	
	@DisplayName("Falta el INICIO_JSON")
	@Test
	void testFaltaInicio() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaInicio.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	
	@DisplayName("Falta el FIN_JSON")
	@Test
	void testFaltaFin() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaFin.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Falta el STATION_NAME_TAG")
	@Test
	void testFaltaStationNameTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaStationNameTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Falta el STATION_NAME_VAL")
	@Test
	void testFaltaStationNameVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaStationNameVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el PERSON_IN_CHARGE_TAG")
	@Test
	void testFaltaPersonInChargeTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaPersonInChargeTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el PERSON_IN_CHARGE_VAL")
	@Test
	void testFaltaPersonInChargeVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaPersonInChargeVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el EMAIL_TAG")
	@Test
	void testFaltaEmailTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaEmailTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el EMAIL_VAL")
	@Test
	void testFaltaEmailVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaEmailVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el MACHINE_NAME_TAG")
	@Test
	void testFaltaMachineNameTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaMachineNameTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el MACHINE_NAME_VAL")
	@Test
	void testFaltaMachineNameVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaMachineNameVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el TYPE_OF_LICENSE_TAG")
	@Test
	void testFaltaTypeOfLicenseTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaTypeOfLicenseTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
				
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el TYPE_OF_LICENSE_VAL")
	@Test
	void testFaltaTypeOfLicenseVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaTypeOfLicenseVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
				
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el REQUEST_DATE_TAG")
	@Test
	void testFaltaRequestDateTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaRequestDateTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el REQUEST_DATE_VAL")
	@Test
	void testFaltaRequestDateVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaRequestDateVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Falta el UUID_TAG")
	@Test
	void testFaltaUUIDTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaUUIDTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el UUID_VAL")
	@Test
	void testFaltaUUIDVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaUUIDVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el LICENSEHASH_TAG")
	@Test
	void testFaltaLicenseHashTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaLicenseHashTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Falta el LICENSEHASH_VAL")
	@Test
	void testFaltaLicenseHashVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaLicenseHashVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Falta el @")
	@Test
	void testFaltaAT() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaAT.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Falta el .")
	@Test
	void testFaltaPunto() throws LMException {
		String FilePath = this.jsonFilesFolder + "FaltaPunto.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	
	@DisplayName("Se repite el INICIO")
	@Test
	void testRepiteInicio() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteInicio.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el FIN")
	@Test
	void testRepiteFin() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteFin.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite una coma")
	@Test
	void testRepiteComa() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteComa.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el STATION_NAME")
	@Test
	void testRepiteStationName() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteStationName.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Se repite el STATION_NAME_TAG")
	@Test
	void testRepiteStationNameTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteStationNameTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el STATION_NAME_VAL")
	@Test
	void testRepiteStationNameVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteStationNameVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el PERSON_IN_CHARGE")
	@Test
	void testRepitePersonInCharge() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepitePersonInCharge.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el PERSON_IN_CHARGE_TAG")
	@Test
	void testRepitePersonInChargeTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepitePersonInChargeTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el PERSON_IN_CHARGE_VAL")
	@Test
	void testRepitePersonInChargeVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepitePersonInChargeVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	
	
	@DisplayName("Se repite el EMAIL")
	@Test
	void testRepiteEmail() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteEmail.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el EMAIL")
	@Test
	void testRepiteEmailTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteEmailTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el EMAIL_VAL")
	@Test
	void testRepiteEmailVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteEmailVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	
	
	@DisplayName("Se repite el MACHINE_NAME")
	@Test
	void testRepiteMachineName() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteMachineName.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el MACHINE_NAME_TAG")
	@Test
	void testRepiteMachineNameTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteMachineNameTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el MACHINE_NAME_VAL")
	@Test
	void testRepiteMachineNameVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteMachineNameVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el TYPE_OF_LICENSE")
	@Test
	void testRepiteTypeOfLicense() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteTypeOfLicense.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se repite el TYPE_OF_LICENSE_TAG")
	@Test
	void testRepiteTypeOfLicenseTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteTypeOfLicenseTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el TYPE_OF_LICENSE_VAL")
	@Test
	void testRepiteTypeOfLicenseVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteTypeOfLicenseVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el REQUEST_DATE")
	@Test
	void testRepiteRequestDate() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteRequestDate.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	@DisplayName("Se repite el REQUEST_DATE_TAG")
	@Test
	void testRepiteRequestDateTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteRequestDateTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	
	@DisplayName("Se repite el REQUEST_DATE_VAL")
	@Test
	void testRepiteRequestDateVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteRequestDateVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el UUID")
	@Test
	void testRepiteUUID() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteUUID.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se repite el UUID_TAG")
	@Test
	void testRepiteUUIDTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteUUIDTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se repite el UUID_VAL")
	@Test
	void testRepiteUUIDVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteUUIDVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	
	@DisplayName("Se repite el LICENSEHASH")
	@Test
	void testRepiteLicenseHash() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteLicenseHash.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se repite el LICENSEHASH_TAG")
	@Test
	void testRepiteLicenseHashTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteLicenseHashTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se repite el LICENSEHASH_VAL")
	@Test
	void testRepiteLicenseHashVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "RepiteLicenseHashVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	
	
	
	@DisplayName("Se modifica el INICIO")
	@Test
	void testModificaInicio() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifInicio.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se modifica el FIN")
	@Test
	void testModificaFin() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifFin.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se modifica una coma")
	@Test
	void testModificaComa() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifComa.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se modifica el STATION_NAME_TAG")
	@Test
	void testModificaStationName() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifStationName.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}
	
	@DisplayName("Se modifica el PERSON_IN_CHARGE_TAG")
	@Test
	void testModificaPersonInCharge() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifPersonInCharge.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se modifica el EMAIL_TAG")
	@Test
	void testModificaEmail() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifEmail.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se modifica el MACHINE_NAME_TAG")
	@Test
	void testModificaMachineName() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifMachineName.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se modifica el TYPE_OF_LICENSE_TAG")
	@Test
	void testModificaTypeOfLicense() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifTypeOfLicense.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se modifica el REQUEST_DATE_TAG")
	@Test
	void testModificaRequestDate() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifRequestDate.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}


	@DisplayName("Se modifica el UUID_TAG")
	@Test
	void testModificaUUID() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifUUID.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}


	@DisplayName("Se modifica el LICENSEHASH_TAG")
	@Test
	void testModificaLicenseHashTag() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifLicenseHashTag.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}

	@DisplayName("Se modifica el LICENSEHASH_VAL")
	@Test
	void testModificaLicenseHashVal() throws LMException {
		String FilePath = this.jsonFilesFolder + "ModifLicenseHashVal.json";
		String expected = "Error: invalid syntax. Maybe not a JSON file?";
		String obtained=null;
		try{
		License obtainedLicense = this.myLicenseManager.SwitchOffLicense(FilePath);
		}catch(Exception e) {
			obtained=e.getMessage();
		}
		
		
		assertEquals (expected, obtained);
	}































}
