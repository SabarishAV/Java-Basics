// Thread Priority

class Thread6 extends Thread{
    Thread6(String name){
        super(name);
    }
    @Override
    public void run(){
        while (true){
            System.out.println(this.getName());
        }
    }
}

public class Thread4 {
    public static void main(String[] args) {
        Thread6 t1 = new Thread6("Thread1 (Most Important)");
        Thread6 t2 = new Thread6("Thread2");
        Thread6 t3 = new Thread6("Thread3");
        Thread6 t4 = new Thread6("Thread4");
        Thread6 t5 = new Thread6("thread5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
