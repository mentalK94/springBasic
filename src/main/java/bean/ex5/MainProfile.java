package bean.ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MainProfile {

    public static void main(String[] args) {
        String profile = null;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if(str.equals("develop")) {
            profile="develop";
        } else if(str.equals("service")){
            profile="service";
        }

        scanner.close();

        // XML방식
//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.getEnvironment().setActiveProfiles(profile); // 설정파일을 결정
//        context.load("dev.xml", "service.xml");
//        context.refresh();

        // Java방식
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(DevConfig.class, ServiceConfig.class);
        context.refresh();

        ProfileEx profileEx = context.getBean("profileEx", ProfileEx.class);
        System.out.println(profileEx.getIp());
        System.out.println(profileEx.getPort());

        context.close();
    }
}
