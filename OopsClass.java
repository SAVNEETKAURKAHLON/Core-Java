class Animals{
    int eyes;
    int ears;
    int nose;
    void animalFunction(){
        System.out.println("hello");
    }
}
public class OopsClass {
    public static void main(String args[]){
        Animals dog=new Animals();
        dog.eyes=2;
        System.out.println("eyes of dogs "+dog.eyes);
        Kdiamond k = new Kdiamond();
        k.showStar();
    }
}
