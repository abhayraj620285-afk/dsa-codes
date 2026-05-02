package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerClass(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerClass();
        }finally{
            lock.unlock();
        }
    }
    public void innerClass(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        }finally{
            lock.unlock();
        }
    }

    static void main() {
        ReentrantExample example = new ReentrantExample();
        example.outerClass();
    }

}
