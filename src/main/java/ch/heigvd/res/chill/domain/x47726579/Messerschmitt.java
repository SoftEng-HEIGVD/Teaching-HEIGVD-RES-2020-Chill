package ch.heigvd.res.chill.domain.x47726579;
import ch.heigvd.res.chill.domain.IProduct;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Messerschmitt implements IProduct
{
	public final static String     NAME  = "Messerschmitt";
	public final static BigDecimal PRICE = new BigDecimal(4.5);

	@Override
	public String getName()
	{
		return NAME;
	}

	@Override
	public BigDecimal getPrice()
	{
		return PRICE;
	}
}