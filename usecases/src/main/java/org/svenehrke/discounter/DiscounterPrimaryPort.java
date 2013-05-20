package org.svenehrke.discounter;

public class DiscounterPrimaryPort implements IDiscounterPrimaryPort {

	private final IDiscounterSecondaryPort discounterSecondaryPort;

	public DiscounterPrimaryPort(final IDiscounterSecondaryPort discounterSecondaryPort) {
		this.discounterSecondaryPort = discounterSecondaryPort;
	}

	@Override
	public double calculatedDiscountAPI(final double amount) {
		return discounterSecondaryPort.calculatedDiscountSPI(amount);
	}
}
