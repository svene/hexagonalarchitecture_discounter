package org.svenehrke.discounter;

import java.math.BigDecimal;

public class Rate {
	private final BigDecimal value;

	public Rate(final BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}
}
