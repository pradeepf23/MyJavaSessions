package OOP_InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ForticeHospital fh=new ForticeHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.oncologyServices();
		fh.medicalTraining();
		fh.neuroServices();
		fh.optClinical();
		fh.pediaServices();
		fh.physioServices();
		USMedical.billing();
		ForticeHospital.billing();
		fh.medicalhistory();
		fh.covid19Vaccination();
		fh.medicalRD();
		
		System.out.println(USMedical.min_fee);
		
		//Top Casting
		
		USMedical us=new ForticeHospital();
		us.cardioServices();
		us.emergencyServices();
		us.ENTServices();
		us.physioServices();
		us.covid19Vaccination();
		us.medicalhistory();
		
	}

}
