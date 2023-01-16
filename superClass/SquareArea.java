package superclass;

public class SquareArea extends Rectangle {
    int s;
    SquareArea(int s){
        super(s,s);
    }
    public static void main(String args[]){
        SquareArea squareArea=new SquareArea(10);
        squareArea.area();
        squareArea.perimeter();
        Rectangle rectangle=new Rectangle(10,2);
        rectangle.area();
        rectangle.perimeter();
    }
}
