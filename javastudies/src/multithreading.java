// subclass of Thread class, create class name and make sure it extends
// then we have access to run() method
public class multithreading extends Thread{
    @Override
    public void run () {
        for(int i = 100 ; i >0; i--){
            System.out.println("Thread #1 : " +i);
            try {
                Thread.sleep(1000); // we need try catch because of this method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is finished");
    }
}