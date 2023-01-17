package superClass;

public class SquareArea extends Rectangle {
    int s;
    SquareArea(int s){
        super(s,s);
    }
    public static void main(String args[]){
        SquareArea squareArea=new SquareArea(10);
        squareArea.area("square");
        squareArea.perimeter("square");
        Rectangle rectangle=new Rectangle(10,2);
        rectangle.area("rectangle");
        rectangle.perimeter("rectangle");
    }
}
