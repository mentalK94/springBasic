package di.ex4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMyBatis {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("mybatis.xml");
        MyBatisService myBatisService = xmlApplicationContext.getBean("myBatisService", MyBatisService.class);

        myBatisService.myBatisTest();

        xmlApplicationContext.close();
    }
}
