package OOP.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WeekDays {

    String[] weekDaysArray = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag", "Söndag"};

    public String dayOfWeek(int day) {
        return weekDaysArray[day - 1];
    }

    //Datastrukturer
    // Array är låst till ett antal minnesplatser med bestämd storlek (long, String, int)
    // ArrayList kan lägga till/ta bort platser, snabb att söka i men långsam att ta bort/lägga till
    // LinkedList som arraylist snabb att lägga till långsam att söka
    // HashMap (Register)
    // Stack Måste hela tiden ta i samma ordning, typ tallrikar(first in, first out)
    // Kö/Queue(Först i kön först ut)
    // Tree
    ArrayList<String> weekDaysArrayList = new ArrayList<>(Arrays.asList("Måndag"));
    WeekDays() {
        weekDaysArrayList.add("Måndag");
    }

}
