package bean.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("develop")
public class DevConfig {

    @Bean
    public ProfileEx profileEx() {
        ProfileEx profileEx = new ProfileEx();
        profileEx.setIp("localhost");
        profileEx.setPort("8660");
        return profileEx;
    }

}
