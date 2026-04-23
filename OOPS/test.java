package OOPS;

public class test {
    static void main() {
        //  created Anonymous class instead of implementation class
       Student Engineeringstudent = new Student() {
           @Override
           public String getBio(String name) {
               return name + " is engineering student";
           }
       };
       // Instead of anonymous class created lambda expression
       Student LawStudent = (String name) ->{
           return name+"is law student";
       };
       String ram = Engineeringstudent.getBio("Ram");
        System.out.println(ram);
        String shyam = LawStudent.getBio("shyam");
        System.out.println(shyam);
    }
}
