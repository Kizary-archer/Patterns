package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.Movement.FlyMovement;
import Patterns.AbstractFactory.Movement.Movement;
import Patterns.AbstractFactory.Weapon.Arbalet;
import Patterns.AbstractFactory.Weapon.Weapon;

public class ElfFactory implements HeroFactory {
    @Override
    public Movement createMovenment() {
        return new FlyMovement();
    }

    @Override
    public Weapon createWeapon() {
        return new Arbalet();
    }
}
