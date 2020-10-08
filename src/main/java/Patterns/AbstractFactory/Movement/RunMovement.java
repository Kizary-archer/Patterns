package Patterns.AbstractFactory.Movement;

public class RunMovement implements Movement {
    @Override
    public void move() {
        System.out.println("бежать");
    }
}
