package com.lowleveldesign.designpatterns.behavioural.strategy;

import java.math.BigDecimal;

// Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.

public class StrategyDemo {
    public static void main(String[] args) {
        Discounter diwaliDiscount = new DiwaliDiscount();

        BigDecimal discountedValue = diwaliDiscount
                .applyDiscount(BigDecimal.valueOf(100));
        System.out.println("You have got total rs " + discountedValue  +" on  100 rs amount this Diwali Sell");

        Discounter indDiscount = new IndependenceDayDiscount();

        BigDecimal discountedValue2 = indDiscount
                .applyDiscount(BigDecimal.valueOf(100));
        System.out.println("You have got " + discountedValue2  +"% on Independence Day Sell");

    }
}
