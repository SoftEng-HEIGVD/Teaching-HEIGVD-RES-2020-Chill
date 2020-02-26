package ch.heigvd.res.chill.domain.GTZL1;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DiesIraeTest
{
    @Test
    void thePriceAndNameForDiesIraeShouldBeCorrect()
    {
        DiesIrae beer = new DiesIrae();
        assertEquals(beer.getName(), DiesIrae.NAME);
        assertEquals(beer.getPrice(), DiesIrae.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForDiesIrae()
    {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.DiesIrae";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = DiesIrae.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}