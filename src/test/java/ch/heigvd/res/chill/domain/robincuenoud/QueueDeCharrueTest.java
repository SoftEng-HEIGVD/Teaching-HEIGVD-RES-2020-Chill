package ch.heigvd.res.chill.domain.robincuenoud;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.robincuenoud.QueueDeCharrue;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueDeCharrueTest {

    @Test
    void thePriceAndNameForQueueDeCharrueShouldBeCorrect() {
        QueueDeCharrue beer = new QueueDeCharrue();
        assertEquals(beer.getName(), QueueDeCharrue.NAME);
        assertEquals(beer.getPrice(), QueueDeCharrue.PRICE);
    }

    @Test   
    void aBartenderShouldAcceptAnOrderForQueueDeCharrue() {
        Bartender maurice = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.QueueDeCharrue";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = maurice.order(request);
        BigDecimal expectedTotalPrice = QueueDeCharrue.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}