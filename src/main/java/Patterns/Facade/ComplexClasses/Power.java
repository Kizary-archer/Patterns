package Patterns.Facade.ComplexClasses;

public class Power {
    private boolean status = false;
    public void on(){
        this.status = true;
    }
    public  void  off(){
        this.status = false;
    }

    public boolean isStatus() {
        return status;
    }
}
