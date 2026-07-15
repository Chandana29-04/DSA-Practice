package Arrays;

public class Kadanes{
    public static int MaxSum(int arr[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum<0)
            {
                currentSum=0;
            }
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println("maximun sum is "+MaxSum(arr));
    }

}