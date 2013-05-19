package org.svenehrke.discounter;

public class Main {
	public static void main(String[] args) {
		// Get real Plugins (secondary adapters):
		IDiscounterSecondaryPort discounter = new DiscounterSecondaryAdapter();
		// ..., inject them and start Application:
		new SwingGuiStarter(discounter).start();
	}
}
