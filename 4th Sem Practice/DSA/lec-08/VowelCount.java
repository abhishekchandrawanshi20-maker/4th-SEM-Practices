import java.util.*;

public class VowelCount {
    static int ways(String str, int i, int[] dp) {
        if(i == str.length()) return 0;
        if(dp[i] != -1) return dp[i];
        char ch = str.charAt(i);
        if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
            dp[i] = 1 + ways(str, i+1 ,dp);
        }else{
            dp[i] = ways(str, i+1, dp);
        }
        return dp[i];
    }
    public static void main(String [] args) {
        String str = "education";
        int[] dp = new int[str.length() + 1];
        Arrays.fill(dp, -1);
        int i = 0;
        System.out.println(ways(str, i, dp));
    }

    
}
