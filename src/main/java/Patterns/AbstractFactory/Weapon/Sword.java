package Patterns.AbstractFactory.Weapon;

public class Sword  implements  Weapon{

    @Override
    public void Hit() {
        System.out.println("Удар мечом");
    }
}
