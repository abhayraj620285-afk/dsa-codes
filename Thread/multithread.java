package Thread;
class D extends Thread{
public void run(){
    for(int i=0;i<=5;i++){
        System.out.println("From -D" + i);
    }
    System.out.println("exit from D");
}

}
class B extends Thread{
    public void run(){
        for(int j=0;j<=5;j++){
            System.out.println("From B " + j);
        }
        System.out.println("exit B");
    }
}
class C extends Thread{
    public void run(){
        for(int k=0;k<=5;k++){
            System.out.println("From -K" + k);
        }
        System.out.println("exit from K");
    }
}
public class multithread {
    static void main() {
        new D().start();
        new B().start();
        new C().start();
    }
}
