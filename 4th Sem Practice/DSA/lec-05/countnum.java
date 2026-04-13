

public class countnum {
    static int countzero(int n){
        if (n==0)
            return 0;
        int count = (n%10 == 0) ? 1:0;
        return count + countzero(n/10);
    }
    public static void main(String[] args){
        int n = 1030560;
        System.out.println(countzero(n));
    }
}
