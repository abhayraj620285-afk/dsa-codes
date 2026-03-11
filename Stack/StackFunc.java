package Stack;
// Stack implementation using Array
public class StackFunc {
    public static class Stack{
        private int[] arr = new int[6];
        private int idx = 0;// VVVVimp
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return ;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Empty stack");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Empty Stack");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
          for(int i=0;i<idx;i++){
              System.out.print(arr[i]+" ");
          }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;

        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        st.push(9);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
    }
}
