package Patterns.Observer;

import java.util.HashSet;

public class pub implements Publisher {
    HashSet<Subscriber> observerList = new HashSet<>();

    @Override
    public void addObrerver(Subscriber sub) {
        observerList.add(sub);
    }

    @Override
    public void delObserver(Subscriber sub) {
        observerList.remove(sub);
    }

    @Override
    public void notifyAllObserver(String mail) {
        for (Subscriber subscriber: observerList){
            subscriber.handleEvent(mail);
        }

    }
}
