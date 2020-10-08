package Patterns.Observer;

public interface Publisher {
    public void addObrerver(Subscriber sub);
    public void delObserver(Subscriber sub);
    public void notifyAllObserver(String mail);

}
