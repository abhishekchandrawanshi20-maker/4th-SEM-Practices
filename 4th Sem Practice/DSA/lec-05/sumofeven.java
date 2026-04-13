// sum of even number of array

public class sumofeven {
    static int evensum(int[] arr, int i) {
        if(i== arr.length)
            return 0;
        int val = (arr[i]%2 == 0) ? arr[i] : 0 ;
        return val + evensum(arr, i+1); 

    }
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7} ;
         int i = 0;
         System.out.println(evensum(arr, i)); 
         
    }


}