package bean.ex4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainExt {

    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new GenericXmlApplicationContext("classpath:ext.xml");
        ExternalFileEx externalFileEx = abstractApplicationContext.getBean("externalFileEx", ExternalFileEx.class);

        System.out.println("envId : " + externalFileEx.getId());
        System.out.println("envPW : " + externalFileEx.getPassword());
        System.out.println("extId : " + externalFileEx.getExtId());
        System.out.println("extPW : " + externalFileEx.getExtPassword());

        abstractApplicationContext.close();
    }
}
