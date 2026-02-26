package Backtracking.No;

import java.util.ArrayList;
import java.util.*;
public class OfPerInString {
    public static void printPer(String s,String t,List<String> list){
        if(s.equals("")){
            list.add(t);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rem = left+right;
            printPer(rem,t+ch,list);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        printPer(s,"",list);

        for(String i : list){
            System.out.println("Permutation  : " + i);
        }
    }

}
