package OOP;

public class AClass {


    private String textPrivate;
    public String textPublic;


    public AClass() {
        //this.text = "detta är en text";
        //this.setTextPrivate = "detta är klassens privata text";
        this.setTextPrivate("Detta är klassens privata text");
        this.textPublic = "detta är den publika texten";
    }

    public String getTextPrivate() {
        return textPrivate;
    }

    public void setTextPrivate(String text) {
        this.textPrivate = text;
    }

}
