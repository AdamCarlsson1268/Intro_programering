package assignment;

public class WriteOutLogic {


    private int amountOfRows;
    private int amountOfCharacters;

    public void addRow() {
        amountOfRows++;
    }

    public int getAmountOfRows() {
        return amountOfRows;
    }
    public int getAmountOfCharacters(){
        return amountOfCharacters;
    }
    public void addCharacters(int characters){
        amountOfCharacters = amountOfCharacters + characters;
    }


    public boolean stopProgram(String input) {
        return input.contains("stop");
    }

}
