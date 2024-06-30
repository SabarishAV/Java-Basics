// Thread by implementing Runnable interface

class MyThread3 implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread 1 is running");
        }
    }
}
class MyThread4 implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread 2 is running");
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();

        Thread t3 = new Thread(thread3);
        Thread t4 = new Thread(thread4);

        t3.start();
        t4.start();
    }
}
