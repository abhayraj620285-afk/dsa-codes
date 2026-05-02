package Thread;

public class MyThread1 extends Thread{
    private Counter counter;
    MyThread1(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }

}
