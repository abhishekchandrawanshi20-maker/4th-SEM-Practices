//reverse the number using recursion

public class reversenum {
    int rev =0;
    static int reverse(int n, int rev){
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n%10;
        return reverse(n/10,rev);
    }
    public static void main(String[] args){
        int n = 123;
        System.out.println(reverse(n,0));
    }

}