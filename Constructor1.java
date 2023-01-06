public class Constructor1 {
    Constructor1(){
        System.out.println("default ");
    }
    Constructor1(int a){
        System.out.println("PARAMETRIZED  ");
    }
    public static void main(String args[]){
        Constructor1 constructor1=new Constructor1();
        Constructor1 constructor2=new Constructor1(3);
    }
}
