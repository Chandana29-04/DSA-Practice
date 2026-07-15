package Arrays;

public class Countingsort {
    public static void Sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        //finding largest element in array
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //creating count array
        int count[]=new int[largest+1];
        //counting the frequency
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int idx=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[idx]=i;
                idx++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
