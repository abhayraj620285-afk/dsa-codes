package Thread;

 class SharedResource{
    private int data;
    private boolean hasData;
    public synchronized void produce(int value){
     while(hasData) {
      try {
       wait();
      } catch (InterruptedException e) {
       ;
       Thread.currentThread().interrupt();
      }
     }
       data = value;
      System.out.println("Produced : "+ data);
       hasData = true;

      notify();


    }
    public synchronized int consume(){
     while(!hasData){
       try{
         wait();
       }catch(InterruptedException e){
         Thread.currentThread().interrupt();
       }
      }
     hasData = false;
     System.out.println("Consumer : "+ data);
     notify();
      return data;
    }
}
class Producer implements Runnable{
  private SharedResource sharedResource;
  Producer(SharedResource sharedResource){
   this.sharedResource = sharedResource;
  }
  @Override
  public void run(){
   for(int i=0;i<10;i++){
    sharedResource.produce(i);
   }
  }
}

class Consumer implements Runnable{
  private SharedResource sharedResource;
  Consumer(SharedResource sharedResource){
   this.sharedResource = sharedResource;
 }
 @Override
 public void run(){
   for(int i=0;i<10;i++){
     int val = sharedResource.consume();
   }
  }
}

public class ThreadCommunication {
 static void main() {
  SharedResource resource = new SharedResource();
  Thread producerThread = new Thread(new Producer(resource));
  Thread consumerThread = new Thread(new Consumer(resource));
  producerThread.start();
  consumerThread.start();
 }
}
