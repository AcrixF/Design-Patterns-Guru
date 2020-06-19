package org.neoa.behavioral.Strategy.strategy;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
