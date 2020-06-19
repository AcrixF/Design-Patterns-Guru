package org.neoa.behavioral.StrategyPattern.ex1.strategy;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
