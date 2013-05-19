package org.svenehrke.discounter;

public class DiscounterSecondaryAdapter implements IDiscounterSecondaryPort {
    @Override
    public double calculatedDiscount(double amount) {
        return amount * rate(amount);
    }

    private double rate(double inAmount) {
        return 0.05;
    }
}