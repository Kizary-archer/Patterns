import Patterns.AbstractFactory.Factory.ElfFactory;
import Patterns.AbstractFactory.Hero;
import Patterns.Facade.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.sendMail("just do it");
        Hero hero = new Hero(new ElfFactory());
        hero.run();
        hero.hit();
    }

}
