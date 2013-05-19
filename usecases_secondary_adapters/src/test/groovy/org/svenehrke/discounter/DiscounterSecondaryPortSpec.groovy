package org.svenehrke.discounter

class DiscounterSecondaryPortSpec extends spock.lang.Specification {

    def "test discount"() {
        given:
        IDiscounterSecondaryPort discounter = new DiscounterSecondaryAdapter()

        expect:
        discounter.calculatedDiscount(amount) == discount

        where:
        amount     | discount
        100        | 5
        200        | 10
    }
}
