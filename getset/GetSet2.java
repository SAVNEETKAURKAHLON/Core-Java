package getset;

public class GetSet2 {
    public int a=3;
    // set method will show error with final as it cannot be changed now
    final private int b=4;
    protected int c=5;
    // to make class only readable
    // void setB(int b){
    //     this.b=b;
    // }
    int getB(){
        return b;
    }
}
