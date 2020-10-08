package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.Movement.Movement;
import Patterns.AbstractFactory.Weapon.Weapon;

public interface HeroFactory {
    Movement createMovenment();
    Weapon createWeapon();
}
