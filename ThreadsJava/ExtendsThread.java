package ThreadsJava;

public class ExtendsThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            sleep(10);
        } catch (Exception exception) {

        }
        for (int i = 0; i < 200; i++) {
            System.out.print("\nin run method " + i);
        }
    }

    public static void main(String args[]) {
        ExtendsThread extendsThread = new ExtendsThread();
        extendsThread.start();

        for (int i = 0; i < 200; i++)
            System.out.print("\nafter running thread " + i);
    }

}
