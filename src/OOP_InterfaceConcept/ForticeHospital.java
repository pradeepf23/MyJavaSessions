package OOP_InterfaceConcept;

public class ForticeHospital extends Medical implements USMedical, UKMedical, IndianMedical{

	
	//USMedical
	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FH---ENTServices");
		
	}
	
	@Override
	public void emergencyServices() {
		System.out.println("FH---emergencyServices");
		
	}
	// UKMedical
	@Override
	public void oncologyServices() {
		System.out.println("FH---oncologyServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH---pediaServices");
		
	}
	
	//IndianMedical

	@Override
	public void neuroServices() {
		System.out.println("FH---neuroServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH---dentalServices");
		
	}

	//Individual
	public void medicalTraining() {
		System.out.println("FH---medicalTraining");
	}
	
	public void optClinical() {
		System.out.println("FH---optClinical");
	}
	
	public static void billing() {
		System.out.println("FH---billing");
	}
	
	@Override
	public void medicalhistory() {
		System.out.println("FH----medicalhistory");
	}

	@Override
	public void covid19Vaccination() {
		System.out.println("FH----covid19Vaccination");		
	}
	

}
