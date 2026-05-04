import java.util.Arrays;
public class decodeString {
    static int minSteps(String s  , int i , int[] dp) {
        if (i == s.length()) return 1;  
        if(s == "0" ) return 0;
        if(dp[i] != -1) return dp[i];
        int one = minSteps(s, i+1, dp);
        int two = 0; 
        if(i+1 < s.length() ) {
            int num = s.charAt(i) -'0' + (s.charAt(i+1)-'0');
            if(num <= 26){
                two = minSteps(s, i+2, dp);
            }
        }
        return dp[i] = one + two;
   }

   public static void main(String[] args) {
        String s = "12";
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        int i = 0;
        System.out.println(minSteps(s, i , dp));
        
   }
}
