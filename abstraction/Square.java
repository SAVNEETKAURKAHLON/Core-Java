package abstraction;

public class Square extends ClassShape{
    public void draw(){
        System.out.println("Drawing Square");
    }
    public static void main(String args[]){
        Square square=new Square();
        square.draw();
    }
}
