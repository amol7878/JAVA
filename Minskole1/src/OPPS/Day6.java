package OPPS;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		launchBrowser("chrome", 101);
		launchBrowser("chrome", 101, "1200*800");
	}

	public static void launchBrowser(String browserName) {
		System.out.println(browserName + " Launch Successfully");
	}

	public static void launchBrowser(String browserName, int version) {
		System.out.println(browserName + " Launch successfully" + " With version " + version);
	}

	public static void launchBrowser(String browserName, int version, String setting) {
		System.out.println(browserName + " Successfully Launch" + "With Version " + version);
		System.out.println("Setting used to launch the Browser " + setting);
	}
}
