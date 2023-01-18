package Collections;

import java.util.ArrayList;

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
    }
}
