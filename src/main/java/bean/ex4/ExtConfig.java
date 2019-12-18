package bean.ex4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ExtConfig {

    @Value("${env.id}")
    private String envId;
    @Value("${env.password}")
    private String envPassword;
    @Value("${ext.id}")
    private String extId;
    @Value("${ext.password}")
    private String extPassword;

    @Bean
    public static PropertySourcesPlaceholderConfigurer Properties() {

        // 프로퍼티 파일의 위치랎을 저장하는 객체
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Resource[] locations = new Resource[2];
        locations[0] = new ClassPathResource("env.properties");
        locations[1] = new ClassPathResource("external.properties");
        configurer.setLocations(locations);

        return configurer;
    }

    @Bean
    public ExternalFileEx extConf() {
        ExternalFileEx externalFileEx = new ExternalFileEx();
        externalFileEx.setId(envId);
        externalFileEx.setPassword(envPassword);
        externalFileEx.setExtId(extId);
        externalFileEx.setExtPassword(extPassword);

        return externalFileEx;
    }
}
