// package Collections;

import java.util.*;

public class ArrayListCollection {
    public static void main(String args[]) {
        ArrayList<StudentClass> studentlist = new ArrayList<>();   
        //first way
        StudentClass studentClass1 = new StudentClass();
        studentClass1.rollno = 1;
        studentClass1.name = " Savneet";
        studentClass1.sClass = "Java";

        studentlist.add(studentClass1);

        //seconnd way
        studentlist.add(new StudentClass(2, "Savneet","Html"));
        
        //insert at particular index
        studentlist.add(0, new StudentClass(0, "Savneet","Html"));

        for(int i = 0; i< studentlist.size(); i++){
            StudentClass sClass = studentlist.get(i);
            System.out.print("S class rollno "+sClass.rollno);
            System.out.println(" S class name "+sClass.name);
        }

        List<Integer> intergersList = new ArrayList<Integer>(); // not thread safe
        List<Integer> vectorList = new Vector<>(0); // thread safe + (0)=initial capacity
       // ArrayList<Integer> intergerArrayList = new List<Integer>();
        //scope resolution
       studentlist.forEach(System.out::println);

       for(StudentClass student : studentlist){
         System.out.println("S class rollno "+student.rollno);

       }
       
    }
}
