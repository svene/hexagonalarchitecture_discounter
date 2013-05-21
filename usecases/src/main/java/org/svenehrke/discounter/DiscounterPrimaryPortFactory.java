package org.svenehrke.discounter;

public class DiscounterPrimaryPortFactory {
	public static IDiscounterPrimaryPort newInstance(IDiscounterSecondaryPort discounterSecondaryPort) {
		return new DiscounterPrimaryPort(discounterSecondaryPort);
	}
}
