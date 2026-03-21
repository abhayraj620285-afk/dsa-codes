package BitManipulation;

public class BitwsieAndOrXor {
    static void main() {
        // XOR
        // a^a = 0
        // a^0 = a
        // swapping code using xor
        int a = 3;
        int b = 8;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a is :" + a);
        System.out.println("b is :" +b);
        // for one's complement
        int x = 5;
        System.out.println(~x);
        // for 2's complemeng
        System.out.println(-x);
        System.out.println(~x+1);
    }
}
