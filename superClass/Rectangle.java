package superClass;

public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(String objectType){
       System.out.println("area of "+objectType+" is "+(length*breadth)); 
    }
    public void perimeter(String objectType){
        System.out.println("perimeter of rectangle is "+((2*length)+2*breadth)); 
     }
}
