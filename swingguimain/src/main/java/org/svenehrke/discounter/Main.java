package org.svenehrke.discounter;

public class Main {
	public static void main(String[] args) {
		// Get real Plugin (secondary adapter / SPI Implementation):
		IDiscounterSecondaryPort secondaryPort = new DiscounterSecondaryAdapter();

		// Get real primary adapter / API Implementation):
		IDiscounterPrimaryPort discounter = DiscounterPrimaryPortFactory.newInstance(secondaryPort);

		// ..., inject them and start Application:
		new SwingGuiStarter(discounter).start();
	}
}
