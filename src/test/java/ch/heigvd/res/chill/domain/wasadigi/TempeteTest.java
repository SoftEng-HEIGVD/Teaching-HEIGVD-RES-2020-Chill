package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TempeteTest {

    @Test
    void thePriceAndNameForTempeteShouldBeCorrect() {
        Tempete beer = new Tempete();
        assertEquals(beer.getName(), Tempete.NAME);
        assertEquals(beer.getPrice(), Tempete.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTempete() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.Tempete";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Tempete.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}