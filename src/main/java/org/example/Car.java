package org.example;

public class Car {
    String color;
    Engine engine;

    public void showColor(){
        System.out.println("color " + color);
    }

    public Car(Engine engine){
        this.engine = engine;
        System.out.println("start constructor");
    }
    public void startengine(){
        if(engine== null)
            System.out.println("start engine");
        else
            engine.start();
    }
}
