package di.ex6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBaseball {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("baseball.xml");

        Player player = xmlApplicationContext.getBean("player1", Player.class);
//        System.out.println(player.getName());
//        System.out.println(player.getAge());
//        System.out.println(player.getHeight());
//        System.out.println(player.getWeight());
//        System.out.println(player.getPosition());

        PlayerInfo playerInfo = xmlApplicationContext.getBean("playerInfo1", PlayerInfo.class);
        playerInfo.printInfo();

        BaseballTeam baseballTeam = xmlApplicationContext.getBean("baseballTeam", BaseballTeam.class);
        System.out.println(baseballTeam.toString());
    }

}
