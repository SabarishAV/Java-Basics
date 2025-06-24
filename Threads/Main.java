class Main{
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();

        Runnable1 r2 = new Runnable1(2);
        Thread thread2 = new Thread(r2);

        Runnable1 r3 = new Runnable1(3);
        Thread thread3 = new Thread(r3);

        thread1.start();
        thread2.start();

        try {
            thread2.join();   // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // User threads keep the JVM running, even if other threads (including daemon threads) have errors or finish.

        // Daemon threads are terminated automatically when all user threads have finished.
       // If only daemon threads are left, the JVM will exit — even if the daemon threads are still running.
        thread3.setDaemon(true);
        thread3.start();
    }
}