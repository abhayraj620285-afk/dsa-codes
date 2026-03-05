package HashMap;

import java.util.LinkedList;

public class HashMapImplement {
    public static class MyHashMap<K,V>{
        public static final int Default_CAPACITY = 4;
        public static final float Default_LOAD_FACTOR = 0.75f;
        public class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key = key;
                this.value = value;
            }

        }
        private int n;
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){      // N capacity/size bucket array
            buckets = new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        // search in linkedList and find wether element exist or not
        private int searchInBucket(LinkedList<Node> ll, K key ){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        public MyHashMap(){
            initBuckets(Default_CAPACITY);
        }
        // reshaping the bucket to change the size
        public void rehash(){
            LinkedList<Node>[] oldBucket = buckets;
            initBuckets(oldBucket.length*2);
            for(var bucket : oldBucket){
                for(var node : bucket){
                    put(node.key,node.value);
                }
            }

        }

        public int size(){
            return n;
        }
        // implementing put
        public void put(K key,V value){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei==-1){
                Node node = new Node(key,value);
                currBucket.add(node);
                n++;
            }
            else{
                Node currNode = currBucket.get(ei);
                currNode.value=value;
            }
            if(n>=buckets.length * Default_LOAD_FACTOR){
                rehash();
            }
        }
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){
                Node curr = currBucket.get(ei);
                return curr.value;
            }
            return null;
        }
        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
            }
            return null;
        }


    }
    public static void main(String[] args) {

    }
}
