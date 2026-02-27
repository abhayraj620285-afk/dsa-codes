//package BinarySearchOnAns;
//
//public class CToShipDdays {
//    public int shipWithinDays(int[] weights, int days) {
//        int low = 0;
//        int high = 0;
//        for(int i=0;i<weights.length;i++){
//            low = Math.max(weights[i],low);
//            high+=weights[i];
//        }
//        int ans = high;
//       while(low<=high){
//           int mid = low+(high-low)/2;
//           int count = 0;
//           int sum = 0;
//           for(int i=0;i<weights.length;i++){
//              sum+=weights[i];
//              if(sum==mid){
//                  count++;
//                  sum = 0;
//              }
//           }
//           if(count==days) ans = mid;
//           if(count>days){
//               low = mid+1;
//           }
//           else high = mid-1;
//       }
//    }
//}
