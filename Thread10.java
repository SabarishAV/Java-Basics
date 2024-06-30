class Thread7 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println(this.getName());
            try {
                Thread.sleep(2000);
                // Thread will have an execution gap of 2000 millisec
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread10 {
    public static void main(String[] args) {
        Thread7 th1 = new Thread7();
        Thread7 th2 = new Thread7();
        th1.start();
        try{
//            th1.join();
            // t2 will only start when t1 is finished executing
            // Since this method can throw an error, it must be in try catch
        }catch (Exception e){
            System.out.println(e);
        }
        th2.start();
    }
}
