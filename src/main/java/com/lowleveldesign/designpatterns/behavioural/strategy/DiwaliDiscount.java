package com.lowleveldesign.designpatterns.behavioural.strategy;

import java.math.BigDecimal;

public class DiwaliDiscount implements Discounter {

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        //50% discount
       return amount.multiply(BigDecimal.valueOf(0.5));
    }
}
