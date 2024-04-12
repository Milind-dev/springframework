package org.example;

public class Bike {
   String color;
   Engine engine;

   public void showColor(){
       System.out.println("color " + color);
   }
//    public Bike(){
//        System.out.print("creation of object");
//    }
//    public void setColor(String color){
//        this.color = color;
//        System.out.println("i am setter");
//      }
//    public  Bike(String color){
//        this.color = color;
//        System.out.println("i am constructor");
//      }
//    public void showColor(){
//        System.out.println("bike color is = "+color);
//    }

    public Bike(Engine engine){
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
