package Thread;

public class World implements Runnable{
    public void run(){
        for(int i=0;i<10000;i++){
            System.out.println("World");
        }
    }
}
