package OOP.diceGame;

public class DicePlayer {
    private String name;
    private int score;

    public DicePlayer (String name){
        this.name = name;
        this.score = score;

    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void addScore(int score){
        this.score += score;
    }
    public void resetScore(){
        this.score = 0;
    }

}
