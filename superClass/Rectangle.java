package superclass;

public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
       System.out.println("area of rectangle is "+(length*breadth)); 
    }
    public void perimeter(){
        System.out.println("area of rectangle is "+((2*length)+2*breadth)); 
     }
}
