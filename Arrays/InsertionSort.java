package Arrays;

public class InsertionSort {
    public static void Sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>key){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=key;
            
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
