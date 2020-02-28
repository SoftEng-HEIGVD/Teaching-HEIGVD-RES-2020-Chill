package ch.heigvd.res.chill.domain.GTZL1;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class DiesIrae implements IProduct
{
    public final static String NAME ="Dies Irae";
    public final static BigDecimal  PRICE = new BigDecimal(10.00);

    public String getName()
    {
        return NAME;
    }

    public BigDecimal getPrice()
    {
        return PRICE;
    }
}
