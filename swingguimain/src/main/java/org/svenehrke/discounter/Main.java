package org.svenehrke.discounter;

public class Main {
	public static void main(String[] args) {
		// Get real Plugin (secondary adapter / SPI Implementation):
		IRateProviderSecondaryPort secondaryPort = RateProviderSecondaryAdapterFactory.newInstance();

		// Get real primary adapter / API Implementation):
		IDiscounterPrimaryPort discounter = DiscounterPrimaryPortFactory.newInstance(secondaryPort);
		IDiscounterAdapter adapter = new DiscounterAdapter(discounter);

		// ..., inject them and start Application:
		new SwingGuiStarter(adapter).start();
	}
}
