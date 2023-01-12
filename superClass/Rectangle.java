package superClass;

public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(int length,int breadth){
       System.out.println("area of rectangle is "+(length*breadth)); 
    }
    public void perimeter(int length,int breadth){
        System.out.println("area of rectangle is "+((2*length)+2*breadth)); 
     }
}
