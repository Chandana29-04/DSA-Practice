package Arrays;
//better approach to find the maximum subarray sum is to use prefix sum array with time complexity of O(n^2)
public class PrefixSum {
    public static int Prefix(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        int maxSum=Integer.MIN_VALUE;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<prefix.length;i++){
            int start=i;
            for(int j=i;j<prefix.length;j++){
                int end=j;
                int sum=0;
                sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println("Maximum Subarray Sum using Prefix Sum is: "+Prefix(arr));
    }
}
