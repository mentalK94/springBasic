package bean.ex3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class EnvironmentEx implements EnvironmentAware, InitializingBean, DisposableBean {

    private Environment environment;
    private String id;
    private String password;

    @Override
    public void destroy() throws Exception {

        // 4. 객체 소멸
        System.out.println("destroy() call");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        // 2. properties파일에 property 불러오기
        // 3. 불러온 property값을 EnvironmentEx property에 setting

        System.out.println("afterPropertiesSet() call");
        setId(environment.getProperty("env.id"));
        setPassword(environment.getProperty("env.password"));
    }

    @Override
    public void setEnvironment(Environment environment) { // 1. environment setting
        System.out.println("setEnvironment() call");
        this.environment = environment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
