package org.example;

public class Bike {
   String color;
//    public Bike(){
//        System.out.print("creation of object");
//    }
//    public void setColor(String color){
//        this.color = color;
//        System.out.println("i am setter");
//      }
    public  Bike(String color){
        this.color = color;
        System.out.println("i am constructor");
      }
    public void showColor(){
        System.out.println("bike color is = "+color);
    }
}
