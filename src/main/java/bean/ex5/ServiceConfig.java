package bean.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("service")
public class ServiceConfig {

    @Bean
    public ProfileEx profileEx() {
        ProfileEx profileEx = new ProfileEx();
        profileEx.setIp("221.192.64.92");
        profileEx.setPort("80");
        return profileEx;
    }
}
