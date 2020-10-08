package Patterns.Observer;

public class sub1 implements Subscriber {
    @Override
    public void handleEvent(String str) {
        System.out.println("Первый подписчик получил сообщение:" + str);
    }
}
