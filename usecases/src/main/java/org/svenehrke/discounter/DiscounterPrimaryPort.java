package org.svenehrke.discounter;

class DiscounterPrimaryPort implements IDiscounterPrimaryPort {

	private final IRateProviderSecondaryPort rateProviderSecondaryPort;

	DiscounterPrimaryPort(final IRateProviderSecondaryPort rateProviderSecondaryPort) {
		this.rateProviderSecondaryPort = rateProviderSecondaryPort;
	}

	@Override
	public double calculatedDiscountAPI(final double amount) {
		return amount * rateProviderSecondaryPort.getRate(amount);
	}

}
