import packageclass.*;

public class PackageOutside {
    public static void main(String args[]){
        ClassesPackage classesPackage=new ClassesPackage();
        classesPackage.functionHello();
        // the function is private function so it gives compilation error
        // classesPackage.functionBye();
        // the function is protected som it is not accessible from outside of package
        // classesPackage.functionProtected();
    }
}
