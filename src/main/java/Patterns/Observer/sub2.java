package Patterns.Observer;

public class sub2 implements Subscriber {
    @Override
    public void handleEvent(String str) {
        System.out.println("Второй подписчик получил сообщение:" + str);
    }
}
