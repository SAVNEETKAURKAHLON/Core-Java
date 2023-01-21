package ThreadsJava;

public class ImplementsMethod implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.print("\nin run method implements method i = "+i);
        }
    }

    public static void main(String args[]){
        ImplementsMethod implementsMethod = new ImplementsMethod();
        Thread thread = new Thread(implementsMethod);
        Thread thread1 = new Thread(implementsMethod);

        thread.start();
        thread1.start();

    }
    
}
