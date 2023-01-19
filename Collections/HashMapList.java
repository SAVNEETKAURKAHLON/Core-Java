package Collections;

import java.util.HashMap;

public class HashMapList {
    public static void main(String args[]) {

        //keys will be unique but values can be same
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("savneet", "kaur"); 
        hashmap.put("1", "123");
        hashmap.put("1", "1234");

        for(HashMap.Entry m : hashmap.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }  
    }
}
