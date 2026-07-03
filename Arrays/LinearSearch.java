package Arrays;
//linear search with time complexity O(n)
public class LinearSearch {
    public static void main(String args[]){
        int arr[]={9,5,2,8,10};
        int key=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index: "+i);
                return; 
            }
        }
        System.out.println("Element not found");
    }
}
