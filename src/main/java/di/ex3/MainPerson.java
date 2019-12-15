package di.ex3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerson {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("person.xml");
        PersonInfo personInfo = xmlApplicationContext.getBean("personInfo", PersonInfo.class);
        personInfo.getPersonInfo();

        Person person = xmlApplicationContext.getBean("person2", Person.class);
        personInfo.setPerson(person);
        personInfo.getPersonInfo();

        xmlApplicationContext.close();
    }
}
