package OOPEncapsulation;

public class Browser {


	public void launchChrome() {

	System.out.println("launching chrome...");
	checkRAM();
	checkcompatible();
	checkNetworkConnection();
	checkBrowserVersion();
	System.out.println("chrome is launched...");
	}

	private void checkRAM() {
		System.out.println("check RAM");
	}
	private void checkcompatible() {
		System.out.println("check OS");

	}
	private void checkNetworkConnection() {
		System.out.println("check Network");
	}
	private void checkBrowserVersion() {
		System.out.println("check browser version");

	}
	
}
