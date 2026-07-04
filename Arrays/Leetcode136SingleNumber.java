package Arrays;
import java.util.*;
public class Leetcode136SingleNumber {
    public static int Single1(int arr[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        for(int key:hm.keySet()){
            if(hm.get(key)==1){
                return key;
            }
        }
        return -1;
    }
    public static int single2(int arr[]){//using XOR Time complexity O(n) & Space Complecity O(1)
        int result=0;

        for(int i=0;i<arr.length;i++){
            result^=arr[i];
        }
        return result;
    }
   public static void main(String [] args){
    int arr[]={1,2,4,2,4};
    System.err.println("single element is "+Single1(arr));
   } 
}
