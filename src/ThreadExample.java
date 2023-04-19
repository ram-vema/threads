
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(5);

        for(int i=0;i<10;i++){
            Runnable runnable = new MyThread("worker thread:" +i);
            executor.execute(runnable);
        }
        executor.shutdown();

        while(!executor.isTerminated());
        System.out.println("All Requests are completed");
    }
}