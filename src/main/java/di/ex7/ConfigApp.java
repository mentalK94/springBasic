package di.ex7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ConfigApp {

    @Bean
    public Player player1() {
        ArrayList<String> position = new ArrayList<String>();
        position.add("5번타자");
        position.add("우익수");

        Player player = new Player("채은성", 28, position);
        player.setHeight(184.3);
        player.setWeight(86.0);

        return player;
    }

    @Bean
    public Player player2() {
        ArrayList<String> position = new ArrayList<String>();
        position.add("1번타자");
        position.add("중견수");

        Player player = new Player("이천웅", 29, position);
        player.setHeight(182.3);
        player.setWeight(85.0);

        return player;
    }
}
