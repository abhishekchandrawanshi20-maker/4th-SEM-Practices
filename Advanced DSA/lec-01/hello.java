import java.util.Scanner;

// count the frequency of a digit in a number how many times a digit d is present in a number n

public class hello {
    public static int frequencycount(int n,int d) {
        int count = 0;
        while(n>0) {
            int rem = n%10;
            if(rem == d) {
                count++;
            }
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int d = sc.nextInt();
        int count = frequencycount(n,d);
        System.out.println(count);
            sc.close();
    }

    // decimal no. to binary no. conversion
    public static int decimaltobinary(int n, int d) {
        int ans = 0, pow=1;
        while(n>0) {
            int rem = n%2;
            ans = ans + rem*pow;
            pow = pow*10;
            n = n/2;
        }
        return ans;
    }
}