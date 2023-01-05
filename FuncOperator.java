public class FuncOperator {
    void noArgumentNoReturn(){
        System.out.println("no argument and no return");
    }
    int noArgumentWithReturn(){
        System.out.println("no argument with return");
        return 3;
    }
    int argumentWithReturn(int a){
        System.out.println(" argument with return");
        return a;
    }
    void argumentNoReturn(int a){
        System.out.println(" argument with no return"+a);

    }
public static void main(String args[]){
    FuncOperator argumentReturn=new FuncOperator();
    argumentReturn.noArgumentNoReturn();
    System.out.println("no argument with return "+argumentReturn.noArgumentWithReturn());
    argumentReturn.argumentNoReturn(23);
    System.out.println(" argument with return "+argumentReturn.argumentWithReturn(39));
}

}