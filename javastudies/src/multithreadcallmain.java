public class multithreadcallmain {
    public static void main(String[] args) throws InterruptedException {
        multithreading thread1 = new multithreading();
        multithreadingrunnable runnable1 = new multithreadingrunnable();
        Thread thread2 = new Thread(runnable1); // uses Thread class to implement runnable
        thread1.setDaemon(true); // this make it be a Daemon thread and not an user thread
        // if we have only Daemon threads and the code breaks after
        // calling the threads, so the code will break and threads will be stopped
        // if not Daemon threads, with user threads, the threads will be ran correctly
        thread1.start();
        // System.out.println(1/0); this here would crash the app
        //thread1.join(1000);
        // the above is gonna make thread 2 start only after thread 1 is done, add 1000ms bf start thread2
        thread2.start();
        System.out.println(1/0);
    }
}
