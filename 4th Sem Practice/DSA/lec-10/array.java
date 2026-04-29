// Write a program using recursion to calculate the highest sum of the elements in the array, such that no two elements are adjacent to each other.
// arr=[1,2,3,9]
// ans=11

import java.util.Arrays;
public class array {
    static int maxsum(int[] arr, int i, int[] dp) {
      if(i >= arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int x = arr[i] + maxsum(arr, i+2, dp);
        int y = maxsum(arr, i + 1, dp);
        dp[i] = Math.max(x,y);
        return dp[i];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        int i = 0;
        System.out.println(maxsum(arr, i, dp));
    }
}

