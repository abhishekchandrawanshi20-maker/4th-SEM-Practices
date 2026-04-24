import java.util.*;

public class CountDigit {
    static int count(int n , int[] dp)
    {
        if(n==0){
            return 0;
        }
        if(dp[n] != -1)
            return dp[n];
        dp[n] = 1+count(n/10, dp);
        return dp[n];
    }
    public static void main(String[] args){
        int n = 12345;
        int[] dp = new int[n+10];
        Arrays.fill(dp, -1);
        System.out.println(count(n , dp));
    }
    
}
