package ch.heigvd.res.chill.domain.lehmann;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class JackDaniels implements IProduct {

    public final static String NAME = "Jack Daniel's";
    public final static BigDecimal PRICE = new BigDecimal(40);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}

