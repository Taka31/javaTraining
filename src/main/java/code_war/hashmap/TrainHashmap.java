package code_war.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TrainHashmap {
    public static void main(String[] args) {

        Map<String,Integer> myMap=new HashMap<>();

        myMap.put("Cyril",12);
        myMap.put("Jerome",1223);
        myMap.put("Anthony",124);
        myMap.put("Gertrude",126);
        myMap.put("Bastien",122);
        myMap.put("Aurelie",1212);

        for(Map.Entry<String,Integer> value:myMap.entrySet()){
            System.out.println(value.getValue()+ " "+ value.getKey());
        }

        System.out.println(myMap.values().stream().mapToInt(Integer::intValue).sum());

    }
}
