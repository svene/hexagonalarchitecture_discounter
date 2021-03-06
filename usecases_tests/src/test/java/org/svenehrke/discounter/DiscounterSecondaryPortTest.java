package org.svenehrke.discounter;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class DiscounterSecondaryPortTest {
	@Test
	public void test_1() throws Exception {
		// Get real Plugin (secondary adapter / SPI Implementation):
		IRateProviderSecondaryPort secondaryPort = RateProviderSecondaryAdapterFactory.newInstance();

		// Get real primary adapter / API Implementation):
		IDiscounterPrimaryPort discounter = DiscounterPrimaryPortFactory.newInstance(secondaryPort);

		assertEquals("5.00", String.valueOf(discounter.calculatedDiscountAPI(new BigDecimal("100"))));
		assertEquals("10.00", String.valueOf(discounter.calculatedDiscountAPI(new BigDecimal("200"))));

	}
}
