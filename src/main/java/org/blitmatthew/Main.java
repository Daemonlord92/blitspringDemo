package org.blitmatthew;

import org.blitmatthew.entity.Car;
import org.blitmatthew.entity.Engine;
import org.blitmatthew.entity.V6Engine;
import org.blitmatthew.entity.V8Engine;
import org.blitmatthew.factory.EngineFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = new Car(context.getBean("v6Engine", V6Engine.class));
        car.start();

        Car car1 = new Car(context.getBean("v8Engine", V8Engine.class));
        car1.start();

        Car car2 = context.getBean("carV6", Car.class);
        car2.start();

        Car car3 = new Car(EngineFactory.createEngine("v8"));

        car3.start();
    }
}