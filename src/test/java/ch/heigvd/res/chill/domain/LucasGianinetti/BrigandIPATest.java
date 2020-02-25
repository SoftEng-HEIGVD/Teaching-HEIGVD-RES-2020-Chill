package ch.heigvd.res.chill.domain.LucasGianinetti;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoxerTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        BrigandIPA beer = new BrigandIPA();
        assertEquals(beer.getName(), BrigandIPA.NAME);
        assertEquals(beer.getPrice(), BrigandIPA.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.LucasGianinetti.BrigandIPA";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = BrigandIPA.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}