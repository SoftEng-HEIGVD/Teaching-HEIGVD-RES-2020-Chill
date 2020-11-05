package ch.heigvd.res.chill.domain.walidMassaoudi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Chrab implements IProduct {

    public final static String NAME = "Chrab";
    public final static BigDecimal PRICE = new BigDecimal(5.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}