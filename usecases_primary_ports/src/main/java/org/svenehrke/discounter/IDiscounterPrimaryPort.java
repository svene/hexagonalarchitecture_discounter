package org.svenehrke.discounter;

import java.math.BigDecimal;

public interface IDiscounterPrimaryPort {
	BigDecimal calculatedDiscountAPI(BigDecimal amount);
}
