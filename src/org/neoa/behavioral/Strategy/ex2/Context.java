package org.neoa.behavioral.Strategy.ex2;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executesStrategy(int a, int b) {
        return strategy.execute(a, b);
    }



}
