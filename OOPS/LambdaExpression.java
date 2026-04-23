package OOPS;

public class LambdaExpression {
    static void main() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        Runnable test = () -> {
            for(int i=0;i<10;i++){
                System.out.println(i);
            }
        };
        Thread t1 = new Thread(test);
        t1.start();
    }
}
