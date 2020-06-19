package org.neoa.behavioral.StrategyPattern.ex2.strategy;

public class ConcreteStrategyMultiply implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
