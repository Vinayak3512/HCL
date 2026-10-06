package Day15;
import java.util.concurrent.*;
public class a3 {
    public static void main(String[] args)throws Exception {
        //create thread pool with 2 threads
        ExecutorService executor=Executors.newFixedThreadPool(2);
        
        //subit Callable task
        Future<Integer> f1=executor.submit(()->{
            try{
                System.out.println("Task started...");

                //simulate a time-cinsuming task

                Thread.sleep(10000);

                System.out.println("Task Completed");
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Task interrupted");
            }
            return 10;
        });

        // Get result from Future
        System.out.println("Waiting for result...");
        System.out.println("Result: "+f1.get());

        executor.shutdown();

    }
    
}
