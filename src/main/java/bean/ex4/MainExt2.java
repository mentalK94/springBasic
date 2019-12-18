package bean.ex4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainExt2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        ExternalFileEx externalFileEx = annotationConfigApplicationContext.getBean("extConf", ExternalFileEx.class);

        System.out.println(externalFileEx.getId());
        System.out.println(externalFileEx.getPassword());
        System.out.println(externalFileEx.getExtId());
        System.out.println(externalFileEx.getExtPassword());

        annotationConfigApplicationContext.close();
    }
}
