import Patterns.AbstractFactory.Factory.ElfFactory;
import Patterns.AbstractFactory.Hero;
import Patterns.Decorator.Component.Printer;
import Patterns.Decorator.Decorator;
import Patterns.Decorator.NameDecorator;
import Patterns.Decorator.QuotesDecorator;
import Patterns.Facade.Facade;
import Patterns.Observer.*;
import Patterns.Proxy.Proxy;
import Patterns.Proxy.Video;

public class Main {
    public static void main(String[] args) {
//        Facade facade = new Facade();
//        facade.sendMail("just do it");
//        Hero hero = new Hero(new ElfFactory());
//        hero.run();
//        hero.hit();
//        Decorator decorator = new QuotesDecorator(new Printer());
//        decorator = new NameDecorator(decorator,"Max");
//        decorator.print();
//        Video video = new Proxy("путь к файлу");
//        video.display();
        Publisher publisher = new pub();
        Subscriber sub1 = new sub1();
        publisher.addObrerver(sub1);
        publisher.addObrerver(sub1);
        publisher.addObrerver(new sub2());
        publisher.delObserver(sub1);
        publisher.notifyAllObserver("привет подписчик");
    }
}
