// Write a program to count the steps to reach n from 1,
// n=4
//1111
//112
//121
//211
//22



public class stepsCount {

     static int Count(int n ) {
        if (n == 1) {
            return 1;
        }
        int ans = Count(n - 1);
        if (n % 2 == 0) {
            ans += Count(n / 2);
        }
        if (n % 3 == 0) {
            ans += Count(n / 3);
        }
        return ans;
     }
     
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Count(n));
    }

}
