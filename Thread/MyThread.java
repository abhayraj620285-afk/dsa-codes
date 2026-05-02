package Thread;

// start,sleep,join,setPriority,interrupt,
import javax.crypto.spec.PSource;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() +"- Priority : "+ Thread.currentThread().getPriority() + "- count "+i);
//            try{
//                Thread.sleep(1000);
//            }catch(Exception e){
//                System.out.println(e);
//            }
        }
    }

    static void main() throws InterruptedException {
        MyThread l = new MyThread("Low priority");
     //   MyThread m = new MyThread("Medium Priority");
        l.setDaemon(true);
//        MyThread h = new MyThread("High Priority");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        System.out.println("Main Done");
    //    m.start();
//        h.start();
    }
}
