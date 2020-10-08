package Patterns.AbstractFactory.Weapon;

public class Arbalet implements Weapon {
    @Override
    public void Hit() {
        System.out.println("Выстрел из арбалета");
    }
}
