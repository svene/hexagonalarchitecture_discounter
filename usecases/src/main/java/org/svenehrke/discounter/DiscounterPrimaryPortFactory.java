package org.svenehrke.discounter;

public class DiscounterPrimaryPortFactory {
	public static IDiscounterPrimaryPort newInstance(IRateProviderSecondaryPort rateProviderSecondaryPort) {
		return new DiscounterPrimaryPort(rateProviderSecondaryPort);
	}
}
