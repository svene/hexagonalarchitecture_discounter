package org.svenehrke.discounter;

import org.junit.Test;
import org.svenehrke.discounter.DiscounterPrimaryPort;
import org.svenehrke.discounter.DiscounterSecondaryAdapter;
import org.svenehrke.discounter.IDiscounterPrimaryPort;
import org.svenehrke.discounter.IDiscounterSecondaryPort;

import static org.junit.Assert.assertEquals;

public class DiscounterSecondaryPortTest {
	@Test
	public void test_1() throws Exception {
		// Get real Plugin (secondary adapter / SPI Implementation):
		IDiscounterSecondaryPort secondaryPort = new DiscounterSecondaryAdapter();

		// Get real primary adapter / API Implementation):
		IDiscounterPrimaryPort discounter = DiscounterPrimaryPortFactory.newInstance(secondaryPort);

		assertEquals("5.0", String.valueOf(discounter.calculatedDiscountAPI(100)));
		assertEquals("10.0", String.valueOf(discounter.calculatedDiscountAPI(200)));

	}
}
