package di.ex7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBaseballApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);
        Player player = applicationContext.getBean("player1", Player.class);

        System.out.println(player.getName());
        System.out.println(player.getAge());
        System.out.println(player.getHeight());
        System.out.println(player.getWeight());
        System.out.println(player.getPosition());
    }
}
