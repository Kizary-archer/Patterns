package Patterns.Decorator;

import Patterns.Decorator.Component.Component;

public class NameDecorator extends Decorator {
    String name;

    public NameDecorator(Component component, String name) {
        super(component);
        this.name = name;
    }

    @Override
    public void print() {
        component.print();
        System.out.print(" : " + this.name);
    }
}
