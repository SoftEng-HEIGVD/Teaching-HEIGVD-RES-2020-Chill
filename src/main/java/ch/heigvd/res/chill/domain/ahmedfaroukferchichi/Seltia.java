package ch.heigvd.res.chill.domain.ahmedfaroukferchichi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Seltia implements IProduct {
    public final static BigDecimal PRICE = new BigDecimal(2.0);
    public final static String NAME = "Seltia";
    public  Seltia(){
        System.out.println("a new  ");
    }

    @Override
    public String getName() {
        return "Seltia";
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
