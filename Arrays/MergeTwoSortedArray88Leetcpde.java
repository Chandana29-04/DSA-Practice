package Arrays;
import java.util.Arrays;
public class MergeTwoSortedArray88Leetcpde {

    //basic approach to merge two sorted arrays with time complexity of O((m+n)log(m+n)) and space complexity of O(1)
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }
         Arrays.sort(nums1);
    }

    //best approach to merge two sorted arrays with time complexity of O(m+n) and space complexity of O(1)
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
       int size=m+n;
       int idx=size-1;
       int i=m-1;
       int j=n-1;
        while(i>=0&&j>=0){
            if(nums1[i]<=nums2[j]){
                nums1[idx]=nums2[j];
                idx--;
                j--;
            }else{
                nums1[idx]=nums1[i];
                idx--;
                i--;
            }
        }
        // If there are remaining elements in nums2, copy them
        while(j>=0){
            nums1[idx]=nums2[j];
            idx--;
            j--;
        }
    }

    public static void main(String args[]){
    int[] nums1 = {1, 2, 3, 0, 0, 0};  // nums1 has extra space
       int m = 3;  // Actual elements in nums1
       int[] nums2 = {2, 5, 6};
       int n = 3;  // Elements in nums2
       merge2(nums1, m, nums2, n);
       for(int i=0;i<nums1.length;i++){
        System.out.print(nums1[i]+" ");
       }


    }
}
