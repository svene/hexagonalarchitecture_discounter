package org.svenehrke.discounter;

public class RateProviderSecondaryAdapterFactory {
	public static IRateProviderSecondaryPort newInstance() {
		return new RateProviderSecondaryAdapter();
	}
}
