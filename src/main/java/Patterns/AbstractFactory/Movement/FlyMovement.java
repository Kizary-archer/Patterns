package Patterns.AbstractFactory.Movement;

public class FlyMovement implements Movement {
    @Override
    public void move() {
        System.out.println("Лететь");
    }
}
