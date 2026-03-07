package Heap;
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name,int rno,double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
//    Negative value → this comes before t
//    Positive value → this comes after t
//    0 → equal priority
    public int compareTo(Student t){
        if (this.rno != t.rno)
            return t.rno - this.rno;
        return this.name.compareTo(t.name);

    }

}
public class CustomComparator {
    static void main(String[] args) {
        Student s1 = new Student("Abhay",23,8.6);
        Student s2 = new Student("Sachan",25,8.7);
        Student s3 = new Student("Yash",22,9.1);
        Student s4 = new Student("Samay",29,9.8);
        Student s5 = new Student("Love",21,9.3);
        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);
        for(Student s : arr){
            System.out.print(s.name+" " + s.rno+ " " + s.cgpa+" ");
        }


    }
}
