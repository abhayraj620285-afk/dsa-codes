package ThreadPool;

import java.util.concurrent.*;

public class Executor {
    static void main() {
        ThreadPoolExecutor execute = new ThreadPoolExecutor(2,
                4,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new CustomThreadPool(),
                new CustomCreateHandler());
        for(int i=1;i<=4;i++){
            execute.submit(() -> {
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e ){
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task processed by : "+Thread.currentThread().getName());
            });
        }
        execute.shutdown();
    }
}
class CustomThreadPool implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}

// CREATING CUSTOM REJECT HANDLER
class CustomCreateHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected : "+ r.toString());
    }
}

