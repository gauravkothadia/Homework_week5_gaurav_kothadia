package week5;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme09_People {
    HashMap<String, Integer> people = new HashMap<>();
    Programme09_People(){
        people.put("Indian",502);
        people.put("African",22);
        people.put("American",305);
        people.put("Chinese",300);
    }
    public void printMap(){
        for(Map.Entry<String, Integer> i : people.entrySet()){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Programme09_People ppl = new Programme09_People();
        ppl.printMap();
    }
}
