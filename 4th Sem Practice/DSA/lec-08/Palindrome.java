// import java.util.*;

public class Palindrome {

    static int[][] dp = new int[100][100];

    static boolean ways( String str, int start, int end) {

        if (start >= end) return true;

        if (dp[start][end] != 0) {
            return dp[start][end] == 1;
        }

        if (str.charAt(start) != str.charAt(end)) {
            dp[start][end] = -1;
            return false;
        }

        boolean ans = ways(str, start + 1, end - 1);

        if (ans) {
            dp[start][end] = 1;
        } else {
            dp[start][end] = -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "madamhk";
        System.out.println(ways(str, 0, 6));
    }
}