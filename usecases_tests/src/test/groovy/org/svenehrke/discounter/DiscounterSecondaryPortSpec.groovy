package org.svenehrke.discounter

class DiscounterSecondaryPortSpec extends spock.lang.Specification {

    def "test discount"() {
        given:
		// Get real Plugin (secondary adapter / SPI Implementation):
		IRateProviderSecondaryPort secondaryPort = RateProviderSecondaryAdapterFactory.newInstance();

		// Get real primary adapter / API Implementation):
		IDiscounterPrimaryPort discounter = DiscounterPrimaryPortFactory.newInstance(secondaryPort);

        expect:
        discounter.calculatedDiscountAPI(amount) == discount

        where:
        amount     | discount
        100        | 5
        200        | 10
    }
}
