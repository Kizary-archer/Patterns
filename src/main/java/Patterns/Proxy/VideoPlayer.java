package Patterns.Proxy;

public class VideoPlayer implements Video {
    String sourse;
    public VideoPlayer(String source){
        this.sourse = source;
        load();
    }
    private void load(){
        System.out.println("Загрузка фильма из источника");
    }
    @Override
    public void display() {
        System.out.println("Проигрование фильма");

    }
}
