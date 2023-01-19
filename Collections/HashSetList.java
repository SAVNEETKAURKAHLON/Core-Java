package Collections;

import java.util.*;

public class HashSetList {
    public static void main(String args[]) {
        HashSet<Boolean> hashset = new HashSet<>(); 
        hashset.add(false);
        hashset.add(true);
        hashset.add(false);

        for(Boolean bool : hashset){
            System.out.println(" hash set value "+bool);
        }
        HashSet<Integer> intergerSet = new HashSet<Integer>(); 
        intergerSet.add(5);
        intergerSet.add(45);
        intergerSet.add(50);

        Set<Integer> set = new HashSet<Integer>(); 
        set.add(1);
        set.add(2);
        set.addAll(intergerSet);

        if(set.contains(1)){
            System.out.print("it contains 1");
        }else{
            System.out.print("it does not contain 1");

        };
    }
}
