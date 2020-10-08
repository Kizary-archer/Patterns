package Patterns.Decorator.Component;

public class Printer implements Component {
    @Override
    public void print() {
        System.out.print("hello");
    }
}
