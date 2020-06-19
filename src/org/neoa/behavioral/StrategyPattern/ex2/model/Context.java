package org.neoa.behavioral.StrategyPattern.ex2.model;

import org.neoa.behavioral.StrategyPattern.ex2.strategy.Strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executesStrategy(int a, int b) {
        return strategy.execute(a, b);
    }



}
