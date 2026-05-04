// Write a program using recursion to find the 'k' after addition of the elements of the array
// arr=[1,2,3]
// k=5

import java.util.Arrays;
public class array2 {
    static int findK(int arr[] , int k , int i, int[] dp){
        if(i==arr.length){
            return k;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ans = findK(arr, k-arr[i], i+1, dp);
        dp[i] = ans;
        return dp[i];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 5;
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(findK(arr, k, 0, dp));
    }
}
