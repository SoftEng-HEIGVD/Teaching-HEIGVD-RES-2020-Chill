package ch.heigvd.res.chill.domain.lehmann;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JackDanielsTest {

    @Test
    void thePriceAndNameForJackDanielShouldBeCorrect() {
        JackDaniels beer = new JackDaniels();
        assertEquals(beer.getName(), JackDaniels.NAME);
        assertEquals(beer.getPrice(), JackDaniels.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForJackDaniels() {
        Bartender nicolas = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.lehmann.JackDaniels";
        OrderRequest request = new OrderRequest(10, productName);
        OrderResponse response = nicolas.order(request);
        BigDecimal expectedTotalPrice = JackDaniels.PRICE.multiply(new BigDecimal(10));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}