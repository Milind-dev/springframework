package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        Bike bike = (Bike) ac.getBean("bike");
        bike.showColor(); //why bike color is null because of primitive type string color are not defined
    }
}