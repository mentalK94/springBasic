package bean.ex4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExternalFileEx implements InitializingBean, DisposableBean {

    private String id;
    private String password;
    private String extId;
    private String extPassword;

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy() call");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() call");
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

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getExtPassword() {
        return extPassword;
    }

    public void setExtPassword(String extPassword) {
        this.extPassword = extPassword;
    }
}
