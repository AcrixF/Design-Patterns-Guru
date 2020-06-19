package org.neoa.behavioral.StrategyPattern.ex2;

import org.neoa.behavioral.StrategyPattern.ex2.model.Context;
import org.neoa.behavioral.StrategyPattern.ex2.strategy.ConcreteStrategyAdd;
import org.neoa.behavioral.StrategyPattern.ex2.strategy.ConcreteStrategyMultiply;
import org.neoa.behavioral.StrategyPattern.ex2.strategy.ConcreteStrategySubtract;

public class ExampleApplication {

    public static void main(String[] args) {

        Context context = new Context();

        int number_one = 2;
        int number_two = 5;

        String action = "-";

        if (action.equalsIgnoreCase("+")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equalsIgnoreCase("-")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (action.equalsIgnoreCase("*")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.executesStrategy(number_one, number_two);

        System.out.println("Result: " + result);

    }

}
