package HashMap;
import java.util.*;
public class implement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,1,1,1,2,5,6,7,4,4};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }
            else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int maxCount = 0;
        int maxKey = 0;
        for(var e : freq.entrySet()){
            if(e.getValue() > maxCount ){
                maxCount = e.getValue();
                maxKey = e.getKey();

            }
        }
        System.out.println(maxCount);
        System.out.println(maxKey);
    }
}
