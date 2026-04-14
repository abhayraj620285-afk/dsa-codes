package Thread;

public class lab1 {
    static void main() {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            int arr[] = new int[3];
            arr[5] = 100;

        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception occurred: " + e);
        }
        catch (Exception e) {
            System.out.println("General Exception occurred: " + e);
        }
        finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
