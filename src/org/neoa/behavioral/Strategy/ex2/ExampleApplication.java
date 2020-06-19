package org.neoa.behavioral.Strategy.ex2;

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
