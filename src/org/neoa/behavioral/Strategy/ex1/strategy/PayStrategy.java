package org.neoa.behavioral.Strategy.ex1.strategy;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
