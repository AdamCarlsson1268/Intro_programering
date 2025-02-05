package OOP.namesList;

import java.util.ArrayList;
import java.util.List;

public class Namelist {

    private List<String> names;

    public Namelist(){
        names= new ArrayList<>();
    }

    public void addName(String name) {
        if (!name.equalsIgnoreCase("stop")){
            names.add(name);
        }
    }

    public List<String> getNames() {
        return names;
    }

    public void overwriteFirstName(String newname) {
        if (!names.isEmpty()){
            names.set(0,newname);
        }

    }
}
