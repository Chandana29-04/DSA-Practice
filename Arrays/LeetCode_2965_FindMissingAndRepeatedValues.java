package Arrays;
public class LeetCode_2965_FindMissingAndRepeatedValues {
    // Function to find the missing and repeated values in a 2D grid naive approach with time complexity of O(n^2)and space complexity of O(n^2)
    static class Solution {
    public int[] findMissingAndRepeatedValuesNaive(int[][] grid) {
        int n = grid.length;
        int totalNumbers = n * n;

        int[] freq = new int[totalNumbers + 1];
        int repeated = -1;
        int missing = -1;

        // Count the frequency of each number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        // Find the repeated and missing numbers
        for (int i = 1; i <= totalNumbers; i++) {
            if (freq[i] == 2) {
                repeated = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[] { repeated, missing };
    }}

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 8} // 8 is repeated, and 9 is missing
        };
        Solution sol=new Solution();
        int[] result = sol.findMissingAndRepeatedValuesNaive(grid);
        System.out.println("Repeated: " + result[0] + ", Missing: " + result[1]);
    }

}
