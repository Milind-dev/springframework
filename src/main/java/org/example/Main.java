package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
//        Bike bike = ac.getBean("bike",Bike.class);
//        Bike bike = (Bike) ac.getBean("bike");
//        bike.showColor(); //why bike color is null because of primitive type string color are not defined
        Bike bike = ac.getBean("bike",Bike.class);
        bike.startengine();
        bike.showColor();

        Bike bike2 = ac.getBean("bike",Bike.class);
        bike2.color = "Green";
        bike2.showColor();

    }
}