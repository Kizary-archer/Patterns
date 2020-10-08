package Patterns.Proxy;

import Patterns.Decorator.Component.Printer;

public class Proxy implements Video {
    VideoPlayer videoPlayer;
    String source;
    public Proxy(String source){
        this.source = source;
    }

    @Override
    public void display() {
        if(videoPlayer == null)
        videoPlayer = new VideoPlayer(source);
        videoPlayer.display();
    }
}
