class Thread5 extends Thread{
    Thread5(String name){
        super(name);
    }
    public void run(){
        System.out.println("This thread is running");
    }
}

public class Thread3 {
    public static void main(String[] args) {
        Thread5 thread5 = new Thread5("ABC");
        thread5.start();
        System.out.println("Name of the Thread is " + thread5.getName());
        System.out.println("Id of the Thread is " + thread5.getId());
    }
}
