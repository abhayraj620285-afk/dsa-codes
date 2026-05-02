package OOPS;

interface fact{
    int num(int n);
}
interface TestInterface{
    boolean check(int n);
}
 class MethodInterface{
    static void ThreadStatus(){
        System.out.println("Method reference done");
    }
}
class Test{
    static boolean find(TestInterface i,int b){
        return i.check(b);
    }
}
public class test{

    static void main() {

       Thread t = new Thread(MethodInterface :: ThreadStatus);
       t.start();
        //  created Anonymous class instead of implementation class
//       Student Engineeringstudent = new Student() {
//           @Override
//           public String getBio(String name) {
//               return name + " is engineering student";
//           }
//       };
//       // Instead of anonymous class created lambda expression
//       Student LawStudent = (String name) ->{
//           return name+"is law student";
//       };
//       String ram = Engineeringstudent.getBio("Ram");
//        System.out.println(ram);
//        String shyam = LawStudent.getBio("shyam");
//        System.out.println(shyam);
//        fact obj = (n) ->{
//            int result = 1;
//            for(int i=1;i<=n;i++){
//                result = i*result;
//            }
//            return result;
//        };
//        System.out.println(obj.num(10));
//        boolean result = Test.find((x) -> x%2==0,10);
//        System.out.println(result);
    }


}
