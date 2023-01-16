public class Manager extends Member{
    public void department(){
        
    }
    public static void main(String args[]){
        Member member=new Member();
        member.name="savneet kaur";
        member.age=18;
        member.number=123434;
        member.address="jalandhar";
        member.salary=10000;

        System.out.println("name of manager is "+member.name);
        System.out.println("age of manager is "+member.age);
        System.out.println("age of manager is "+member.number);
        System.out.println("age of manager is "+member.address);
        System.out.println("age of manager is "+member.salary);
    }
   
}
