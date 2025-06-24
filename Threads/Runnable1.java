
class Runnable1 implements Runnable {

    private final int threadNo;

    public Runnable1(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.printf("Thread #%d : %d\n", threadNo, i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.printf("Thread %d completed\n",threadNo);
    }
}
