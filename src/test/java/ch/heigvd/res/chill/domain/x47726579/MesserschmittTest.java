package ch.heigvd.res.chill.domain.x47726579;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MesserschmittTest {

	@Test
	void thePriceAndNameForMesserschmittShouldBeCorrect() {
		Messerschmitt beer = new Messerschmitt();
		assertEquals(beer.getName(), Messerschmitt.NAME);
		assertEquals(beer.getPrice(), Messerschmitt.PRICE);
	}

	@Test
	void aBartenderShouldAcceptAnOrderForMesserschmitt() {
		Bartender jane = new Bartender();
		String productName = "ch.heigvd.res.chill.domain.x47726579.Messerschmitt";
		OrderRequest request = new OrderRequest(4, productName);
		OrderResponse response = jane.order(request);
		BigDecimal expectedTotalPrice = Messerschmitt.PRICE.multiply(new BigDecimal(4));
		assertEquals(expectedTotalPrice, response.getTotalPrice());
	}

}