package org.svenehrke.discounter;

class RateProviderSecondaryAdapter implements IRateProviderSecondaryPort {
	@Override
	public double getRate(final double amount) {
		return 0.05;
	}
}
