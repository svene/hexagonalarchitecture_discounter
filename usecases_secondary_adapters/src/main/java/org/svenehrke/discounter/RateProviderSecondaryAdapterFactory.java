package org.svenehrke.discounter;

public class RateProviderSecondaryAdapterFactory {
	public static IDiscounterPrimaryPort newInstance(IRateProviderSecondaryPort rateProviderSecondaryPort) {
		return new DiscounterPrimaryPort(rateProviderSecondaryPort);
	}
}
