package di.ex1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /* DI 사용 전 */
//        MyGetSum myGetSum = new MyGetSum();
//        myGetSum.setGetSum(new GetSum());
//
//        myGetSum.setA(100);
//        myGetSum.setB(300);

        /* DI 사용 후 */
        //AbstractApplicationContext abstractApplicationContext = new GenericApplicationContext("classpath:getsum.xml");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("getsum.xml");
        MyGetSum myGetSum = classPathXmlApplicationContext.getBean("myGetSum", MyGetSum.class);
        myGetSum.sum();
    }
}




