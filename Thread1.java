// Thread by extending Thread class

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread 1 is running");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread 2 is running");
        }
    }
}


public class Thread1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread2.start();
    }
}
