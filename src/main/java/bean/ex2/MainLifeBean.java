package bean.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLifeBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("lifeBean.xml");
        LifeBean lifeBean = xmlApplicationContext.getBean("lifeBean2", LifeBeanImpl.class);

        lifeBean.lifeMethod();

        xmlApplicationContext.close();
    }
}
