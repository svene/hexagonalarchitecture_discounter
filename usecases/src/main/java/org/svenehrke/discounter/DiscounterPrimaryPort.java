package org.svenehrke.discounter;

class DiscounterPrimaryPort implements IDiscounterPrimaryPort {

	private final IDiscounterSecondaryPort discounterSecondaryPort;

	DiscounterPrimaryPort(final IDiscounterSecondaryPort discounterSecondaryPort) {
		this.discounterSecondaryPort = discounterSecondaryPort;
	}

	@Override
	public double calculatedDiscountAPI(final double amount) {
		return discounterSecondaryPort.calculatedDiscountSPI(amount);
	}
}
