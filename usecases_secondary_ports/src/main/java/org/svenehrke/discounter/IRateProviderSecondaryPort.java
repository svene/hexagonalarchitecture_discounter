package org.svenehrke.discounter;

import java.math.BigDecimal;

public interface IRateProviderSecondaryPort {

    Rate getRate(BigDecimal amount);

}
