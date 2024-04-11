package org.example;

public class Bike {
    String color = "Red"; //color = "Red" is dependent
    Engine engine = new Engine(); //new Engine is dependent

    public void sss(int x) {

    }
    sss(222) //222 is dependent on x
}
