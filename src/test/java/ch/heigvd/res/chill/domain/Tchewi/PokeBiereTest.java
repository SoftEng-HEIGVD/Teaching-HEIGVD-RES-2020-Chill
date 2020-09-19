package ch.heigvd.res.chill.domain.Tchewi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokeBiereTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        PokeBiere beer = new PokeBiere();
        assertEquals(beer.getName(), PokeBiere.NAME);
        assertEquals(beer.getPrice(), PokeBiere.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Tchewi.PokeBiere";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = PokeBiere.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
