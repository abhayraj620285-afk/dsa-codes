package Heap;
import java.util.*;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue <Integer> minHeap = new PriorityQueue<>();
    PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
    }

    public void addNum(int num) {
        if (maxHeap.size() == 0) maxHeap.add(num);
        else {
            if (maxHeap.peek() > num) maxHeap.add(num);
            else minHeap.add(num);
        }
        if(maxHeap.size()==minHeap.size()+2) minHeap.add(maxHeap.remove());
        if(minHeap.size()==maxHeap.size()+2) maxHeap.add(minHeap.remove());
    }

    public double findMedian() {
    if(maxHeap.size()==minHeap.size()){
        int p = maxHeap.peek();
        int q = minHeap.peek();
        return (p+q)/2.0;
    }
    if(maxHeap.size()==minHeap.size()+1) return maxHeap.peek();
    else return minHeap.peek();

    }
}
public class MedianindataStream {
    static void main() {

    }
}
