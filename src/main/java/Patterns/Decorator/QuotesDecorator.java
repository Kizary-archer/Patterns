package Patterns.Decorator;

import Patterns.Decorator.Component.Component;

public class QuotesDecorator extends Decorator {

    public QuotesDecorator(Component component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
