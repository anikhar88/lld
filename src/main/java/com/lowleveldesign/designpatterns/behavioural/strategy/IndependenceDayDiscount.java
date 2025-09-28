package com.lowleveldesign.designpatterns.behavioural.strategy;

import java.math.BigDecimal;

public class IndependenceDayDiscount implements Discounter {

    //25% discount
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.25));
    }
}
