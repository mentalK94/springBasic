package di.ex5;

import di.ex4.MyBatisService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCar {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("car.xml");
        Car car = xmlApplicationContext.getBean("car", Car.class);
        car.drive();
    }
}
