package di.ex6;

public class BaseballTeam {

    private String name; // 팀명
    private String manager; // 야구감독
    private String battingCoach; // 타격코치
    private String pitchingCoach; // 투수코치
    private String hitter; // 타자
    private String pitcher; // 투수

    public BaseballTeam() {}

    public BaseballTeam(String name, String manager, String battingCoach, String pitchingCoach) {
        this.name = name;
        this.manager = manager;
        this.battingCoach = battingCoach;
        this.pitchingCoach = pitchingCoach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getBattingCoach() {
        return battingCoach;
    }

    public void setBattingCoach(String battingCoach) {
        this.battingCoach = battingCoach;
    }

    public String getPitchingCoach() {
        return pitchingCoach;
    }

    public void setPitchingCoach(String pitchingCoach) {
        this.pitchingCoach = pitchingCoach;
    }

    public String getHitter() {
        return hitter;
    }

    public void setHitter(String hitter) {
        this.hitter = hitter;
    }

    public String getPitcher() {
        return pitcher;
    }

    public void setPitcher(String pitcher) {
        this.pitcher = pitcher;
    }

    @Override
    public String toString() {
        return "BaseballTeam{" +
                "name='" + name + '\'' +
                ", manager='" + manager + '\'' +
                ", battingCoach='" + battingCoach + '\'' +
                ", pitchingCoach='" + pitchingCoach + '\'' +
                ", hitter='" + hitter + '\'' +
                ", pitcher='" + pitcher + '\'' +
                '}';
    }
}
