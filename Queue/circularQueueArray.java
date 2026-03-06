package Queue;

public class circularQueueArray {
    public static class CqueueA{
         int front = -1;
         int rear = -1;
         int size = 0;
         int[] arr = new int[100];
         public void add(int x) throws Exception{
             if(size==arr.length){
                 throw new Exception("Queue if full");
             }
             else if(size==0){
                 rear = front = 0;
                 arr[0] = x;
             }
             else if(rear == arr.length-1){
                 rear = 0;
                 arr[0] = x;
             }
             else{
                 arr[++rear] = x;
             }
             size++;
         }
         public int remove() throws Exception{
             if(size==0){
                 throw new Exception("Queue is empty");
             }
             else if(front==arr.length-1){
                 int val = arr[front];
                 front = 0;
                 size--;
                 return val;
             }
             else{
                 int val = arr[front];
                 front++;
                 size--;
                 return val;
             }
         }
         public int peek() throws Exception{
             if(size==0){
                 throw new Exception("Queue is empty");
             }
             else{
                 int val = arr[front];
                 return val;
             }
         }
         public boolean isEmpty(){
             if(size==0) return true;
             else return false;
         }
         public void display(){
             if(size==0){
                 System.out.println("Queue is empty");
             }
             else if(front<=rear){
                 for(int i=front;i<=rear;i++){
                     System.out.println(arr[i]);
                 }
             }
             else{
                 for(int i=front;i<arr.length;i++){
                     System.out.println(arr[i]+" ");
                 }
                 for(int i=0;i<front;i++){
                     System.out.println(arr[i]+" ");
                 }
             }
             System.out.println();
         }
    }
    public static void main(String[] args) throws Exception{
        CqueueA q = new CqueueA();
        q.display();
        //q.remove();
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(9);
        q.display();
    }
}
