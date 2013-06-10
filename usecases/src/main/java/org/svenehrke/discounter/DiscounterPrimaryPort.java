package org.svenehrke.discounter;

import java.math.BigDecimal;

class DiscounterPrimaryPort implements IDiscounterPrimaryPort {

	private final IRateProviderSecondaryPort rateProviderSecondaryPort;

	DiscounterPrimaryPort(final IRateProviderSecondaryPort rateProviderSecondaryPort) {
		this.rateProviderSecondaryPort = rateProviderSecondaryPort;
	}

	@Override
	public BigDecimal calculatedDiscountAPI(final BigDecimal amount) {
		return amount.multiply(rateProviderSecondaryPort.getRate(amount).getValue());
	}

}
