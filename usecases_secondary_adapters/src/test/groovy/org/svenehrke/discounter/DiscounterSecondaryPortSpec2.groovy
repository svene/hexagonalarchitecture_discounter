package org.svenehrke.discounter

class DiscounterSecondaryPortSpec2 extends spock.lang.Specification {

    def "test discount"() {
        given:
		// Get real Plugin (secondary adapter / SPI Implementation):
		IDiscounterSecondaryPort secondaryPort = new DiscounterSecondaryAdapter();

        expect:
		secondaryPort.calculatedDiscountSPI(amount) == discount

        where:
        amount     | discount
        100        | 5
        200        | 10
    }
}
