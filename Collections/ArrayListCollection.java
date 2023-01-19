package Collections;

import java.util.*;

public class ArrayListCollection {
    public static void main(String args[]) {
        ArrayList<StudentClass> studentlist = new ArrayList<>();   
        StudentClass studentClass1 = new StudentClass();
        studentClass1.rollno = 1;
        studentClass1.name = " Savneet";
        studentClass1.sClass = "Java";

        studentlist.add(studentClass1);

        studentlist.add(new StudentClass(2, "Savneet","Html"));
        studentlist.add(0, new StudentClass(0, "Savneet","Html"));

        for(int i = 0; i< studentlist.size(); i++){
            StudentClass sClass = studentlist.get(i);
            System.out.print("S class rollno "+sClass.rollno);
            System.out.println(" S class name "+sClass.name);
        }

        List<Integer> intergersList = new ArrayList<Integer>(); // not thread safe
        List<Integer> vectorList = new Vector<>(0); // thread safe
       // ArrayList<Integer> intergerArrayList = new List<Integer>();
        //scope resolution
       studentlist.forEach(System.out::println);

       for(StudentClass student : studentlist){
         System.out.println("S class rollno "+student.rollno);

       }
       
    }
}
