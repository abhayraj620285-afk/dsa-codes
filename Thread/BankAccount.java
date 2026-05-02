package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw");
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + "Proceeding with withdraw");
                    try {
                        Thread.sleep(1000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "Withdraw Successful Remaining amount" + amount);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "insufficient balance");
                }
            }else{
                System.out.println("Could not get the Lock");
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }

}
