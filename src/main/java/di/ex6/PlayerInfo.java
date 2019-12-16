package di.ex6;

public class PlayerInfo {

    public Player player;

    public PlayerInfo() {}

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void printInfo() {
        System.out.println("이름 : "+this.player.getName());
        System.out.println("나이 : "+this.player.getAge()+"세");
        System.out.println("키 : "+this.player.getHeight()+"cm");
        System.out.println("몸무게 : "+this.player.getWeight()+"kg");
        System.out.println("포지션 : "+this.player.getPosition());
    }
}
