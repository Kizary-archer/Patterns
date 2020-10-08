package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.Movement.Movement;
import Patterns.AbstractFactory.Movement.RunMovement;
import Patterns.AbstractFactory.Weapon.Sword;
import Patterns.AbstractFactory.Weapon.Weapon;

public class warriorFacrory implements HeroFactory {
    @Override
    public Movement createMovenment() {
        return new RunMovement();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
