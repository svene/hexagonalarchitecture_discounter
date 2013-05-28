package org.svenehrke.discounter;

public class DiscounterAdapter implements IDiscounterAdapter {
	private final IDiscounterPrimaryPort discounterApi;

	public DiscounterAdapter(final IDiscounterPrimaryPort discounterApi) {
		this.discounterApi = discounterApi;
	}

	@Override
	public String discountedAmount(final String input) {
		double amount = Double.parseDouble(input);
		double discount = discounterApi.calculatedDiscountAPI(amount);
		return String.valueOf(discount);
	}
}
