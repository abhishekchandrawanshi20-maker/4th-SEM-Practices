import java.util.Scanner;

// count array index

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
        int d = sc.nextInt();
        int index =-1;
        for(int i=0; i<n; i++) 
        {
            if(arr[i] == d) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }    
}
 
