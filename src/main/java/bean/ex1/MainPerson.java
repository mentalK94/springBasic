package bean.ex1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerson {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("person_bean.xml");
        Person person1 = xmlApplicationContext.getBean("person", Person.class);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person person2 = xmlApplicationContext.getBean("person", Person.class);
        if(person1.equals(person2)) {
            System.out.println("같은 객체");
        } else {
            System.out.println("다른 객체");
        }
    }
}
