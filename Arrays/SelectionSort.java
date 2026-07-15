package Arrays;

public class SelectionSort {
    public static void Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
            }

            //swapping
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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
