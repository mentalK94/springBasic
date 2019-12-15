package di.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("examDao.xml");
        ExamDAO examDAO = applicationContext.getBean("examDao", ExamDAO.class);

        examDAO.outputMsg();
    }
}
