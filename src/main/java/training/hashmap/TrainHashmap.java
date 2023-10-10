package training.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TrainHashmap {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Cyril", 37);
        myMap.put("JB", 38);
        myMap.put("Cat", 7);
        myMap.put("Marie", 17);
        myMap.put("Twix", 78);

        myMap.forEach((k,v)->{
            System.out.println("Mon utilisateur "+k+ " a "+v+" an(s)");
        });

        for(Map.Entry<String, Integer> entry: myMap.entrySet()){
            System.out.println("mon age est "+entry.getValue()+ " mon utilisateur est "+entry.getKey());
        }

        System.out.println("la somme des ages est de "+myMap.values().stream().mapToInt(Integer::intValue).sum());

    }
}
