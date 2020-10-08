package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Factory.HeroFactory;
import Patterns.AbstractFactory.Movement.Movement;
import Patterns.AbstractFactory.Weapon.Weapon;

public class Hero {
    private Weapon weapon;
    private Movement movement;

    public Hero(HeroFactory factory) {
        weapon = factory.createWeapon();
        movement = factory.createMovenment();
    }

    public void run(){
        movement.move();
    }
    public void hit(){
        weapon.Hit();
    }
}
