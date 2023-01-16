package abstraction;

public class Rectangle extends ClassShape{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
    public static void main(String args[]){
        Rectangle rectangle=new Rectangle();
        rectangle.draw();
    }
}
