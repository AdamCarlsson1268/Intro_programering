package OOP.hashMap;

import java.util.HashMap;

public class NamesAge {
    private HashMap<String, Integer> namesAge = new HashMap<>();
    NamesAge(){
        namesAge.put("Adam",29);
        namesAge.put("Emma", 29);
        namesAge.put("Jenny", 62);
        namesAge.put("Thomas", 58);
        namesAge.put("Ludwig", 26);

    }
    public int getAge(String name){
        return namesAge.get(name);
    }
}
