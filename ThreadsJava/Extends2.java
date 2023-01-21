package ThreadsJava;

public class Extends2 extends Thread{
    @Override
    public void run(){
        System.out.println("the extend is running");
    }
    public static void main(String args[]){
        Extends2 extends2=new Extends2();
        Thread thread=new Thread(extends2);
        thread.start();
    }
}
