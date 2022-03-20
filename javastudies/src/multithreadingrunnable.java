public class multithreadingrunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i <100; i++){
            System.out.println("Thread #2 : " +i);
            try {
                Thread.sleep(1000); // we need try catch because of this method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished");
    }
}