package packageclass;
import packageclass.ClassesPackage;
public class simplePackage {
    public static void main(String args[]){
        ClassesPackage classesPackage=new ClassesPackage();
        classesPackage.functionHello();
        // the function uis private function so it gives compilation error
        // classesPackage.functionBye();
        classesPackage.functionProtected();
    }
}
