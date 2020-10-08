package Patterns.Decorator;

import Patterns.Decorator.Component.Component;

public abstract class Decorator implements Component {
    Component component;
    public Decorator(Component component){
        this.component = component;
    }
}
