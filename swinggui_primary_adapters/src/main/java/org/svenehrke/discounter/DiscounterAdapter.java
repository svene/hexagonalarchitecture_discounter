package org.svenehrke.discounter;

import java.math.BigDecimal;

public class DiscounterAdapter implements IDiscounterAdapter {
	private final IDiscounterPrimaryPort discounterApi;

	public DiscounterAdapter(final IDiscounterPrimaryPort discounterApi) {
		this.discounterApi = discounterApi;
	}

	@Override
	public String discountedAmount(final String input) {
		BigDecimal amount = new BigDecimal(input);
		BigDecimal discount = discounterApi.calculatedDiscountAPI(amount);
		return String.valueOf(discount);
	}
}
