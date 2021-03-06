package ch.heigvd.res.chill.domain.Rosy1996;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TripelKarmelietTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    TripelKarmeliet beer = new TripelKarmeliet();
    assertEquals(beer.getName(), TripelKarmeliet.NAME);
    assertEquals(beer.getPrice(), TripelKarmeliet.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Rosy1996.TripelKarmeliet";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = TripelKarmeliet.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}