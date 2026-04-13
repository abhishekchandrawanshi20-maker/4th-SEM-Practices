// public class count_elementofarray {
//     static int countoccurofkey(int[] arr, int i, int key) {
//         if(i== arr.length)
//             return 0;
//         int count = (arr[i] == key) ? 1 : 0 ;
//         return count + countoccurofkey(arr, i+1, key );

//     }
//     public static void main(String[] args) {
//          int[] arr = {1,2,3,4,5,6,7} ;
//          int key = 2 ; 
//          int i = 0;
//          System.out.println(countoccurofkey(arr, i, key)); 
         
//     }
// }




public class count_elementofarray {
    static boolean countoccurofkey(int[] arr, int i, int key) {
        if(i== arr.length)
            return false;
        if(arr[i]==key) return true;
        return countoccurofkey(arr, i+1, key);

    }
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7} ;
         int key = 2 ; 
         int i = 0;
         System.out.println(countoccurofkey(arr, i, key)); 
         
    }
}
