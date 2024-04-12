package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    private static ApplicationContext ac;
    public static void main(String[] args) {
        ac = new ClassPathXmlApplicationContext("application.xml");
//        Bike bike = ac.getBean("bike",Bike.class);
//        Bike bike = (Bike) ac.getBean("bike");
//        bike.showColor(); //why bike color is null because of primitive type string color are not defined
//        Bike bike = ac.getBean("bike",Bike.class);
//        bike.startengine();
//        bike.showColor();

//        Bike bike2 = ac.getBean("bike",Bike.class);
//        bike2.color = "Green";
//        bike2.showColor();

//        Car car = ac.getBean("car",Car.class);
//        bike.startengine();
//        bike.showColor();

        Company compan =  ac.getBean("company",Company.class);
        compan.companyWork();

    }
}