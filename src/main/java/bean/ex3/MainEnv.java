package bean.ex3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

public class MainEnv {
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext configurableApplicationContext = new GenericXmlApplicationContext();
        ConfigurableEnvironment configurableEnvironment = configurableApplicationContext.getEnvironment();

        MutablePropertySources propertySources = configurableEnvironment.getPropertySources();
        propertySources.addLast(new ResourcePropertySource("classpath:env.properties"));

        System.out.println(configurableEnvironment.getProperty("env.id"));
        System.out.println(configurableEnvironment.getProperty("env.password"));

        GenericXmlApplicationContext genericXmlApplicationContext = (GenericXmlApplicationContext) configurableApplicationContext;
        genericXmlApplicationContext.load("env.xml");
        genericXmlApplicationContext.refresh();

        EnvironmentEx environmentEx = genericXmlApplicationContext.getBean("env", EnvironmentEx.class);
        System.out.println(environmentEx.getId());
        System.out.println(environmentEx.getPassword());

        genericXmlApplicationContext.close();
        configurableApplicationContext.close();
    }
}
