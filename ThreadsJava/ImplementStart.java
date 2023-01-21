package ThreadsJava;

public class ImplementStart implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
        System.out.println("Implement is running "+i);

        }
    }
    public static void main(String args[]){
        ImplementStart implementstart=new ImplementStart();
        ImplementsMethod implementsMethod=new ImplementsMethod();
        Thread thread=new Thread(implementstart);
        Thread thread1=new Thread(implementsMethod);
        Thread thread2=new Thread(implementstart);
        Thread thread3=new Thread(implementstart);
        Thread thread4=new Thread(implementstart);

        thread.start();

        try {
            thread.join(10); // terminate the current thread
            thread1.start();
            thread.sleep(20);

        } catch(InterruptedException exception){
            exception.printStackTrace();
        }
    } 
}
