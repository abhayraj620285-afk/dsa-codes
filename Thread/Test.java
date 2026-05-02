package Thread;

public class Test {
    static void main() {
        Counter counter = new Counter();
        MyThread1 t1 = new MyThread1(counter);
        MyThread1 t2 = new MyThread1(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(counter.getCount());

    }
}
