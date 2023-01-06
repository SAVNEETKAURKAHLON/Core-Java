public class OverloadingArea {
    int area(int a){
        return a*a;
    } 
    int area(int a,int b){
        return a*b;
    }
    float area(float c){
        return (float)(3.14*c*c);
    }
    float area(float a,float b){
        return (float)(0.5*a*b);
    }
    public static void main(String args[]){
        OverloadingArea overloadingArea=new OverloadingArea();        
        System.out.println("square" +overloadingArea.area(2));
        System.out.println("rectangle"+overloadingArea.area(2,3));
        System.out.println("circle"+overloadingArea.area(2f));
        System.out.println("rhombus"+overloadingArea.area(2f,3f));

    }
}
