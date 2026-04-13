import java.util.Arrays;

public class replacenum {
    static void replace(int[] arr, int i) {
        if(i==arr.length) return;
        if(arr[i]==2) 
            arr[i]= 5;
        replace(arr, i+1);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,2};
        int i = 0;
        replace (arr, i+1);
        System.out.println(Arrays.toString(arr));
    }

}
