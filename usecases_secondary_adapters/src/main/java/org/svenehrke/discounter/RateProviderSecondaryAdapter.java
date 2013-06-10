package org.svenehrke.discounter;

import java.math.BigDecimal;

class RateProviderSecondaryAdapter implements IRateProviderSecondaryPort {
	@Override
	public Rate getRate(final BigDecimal amount) {
		return new Rate(new BigDecimal("0.05"));
	}
}
