package Arrays;

public class MxSubArraySum {
    // Function to find the maximum subarray sum using brute force approach
    public static int MaxSum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){//time complexity is O(n^3)
            int start=i;
            for(int j=i+1;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        System.out.println("Maximum Subarray Sum is: "+MaxSum(arr));
    }
}