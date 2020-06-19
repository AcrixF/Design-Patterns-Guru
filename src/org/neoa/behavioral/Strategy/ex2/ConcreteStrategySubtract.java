package org.neoa.behavioral.Strategy.ex2;

public class ConcreteStrategySubtract implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
