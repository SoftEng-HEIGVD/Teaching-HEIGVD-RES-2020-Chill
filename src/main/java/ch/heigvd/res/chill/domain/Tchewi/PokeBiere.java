package ch.heigvd.res.chill.domain.Tchewi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PokeBiere implements IProduct {

    public final static String NAME = "PokéBière";
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
