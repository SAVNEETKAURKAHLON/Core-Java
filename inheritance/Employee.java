
public class Employee extends Member{
     public void specialization(){
        
    }
    public static void main(String args[]){
        Member member=new Member();
        member.name="savneet";
        member.age=18;
        member.number=1234;
        member.address="jal";
        member.salary=1000;

        System.out.println("name of employee is "+member.name);
        System.out.println("age of member is "+member.age);
        System.out.println("age of number is "+member.number);
        System.out.println("age of address is "+member.address);
        System.out.println("age of salary is "+member.salary);
    }
   
}