package ch.heigvd.res.chill.domain.thomasrieder;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InnisAndGunnTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        InnisAndGunn beer = new InnisAndGunn();
        assertEquals(beer.getName(), InnisAndGunn.NAME);
        assertEquals(beer.getPrice(), InnisAndGunn.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.thomasrieder.InnisAndGunn";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = InnisAndGunn.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}