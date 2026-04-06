import java.util.*; 

// find Diagonal of 2d Array
// public class main {
//     public static void main(String[] args) {
//         int []arr = new int [n];
//         for(int i=0; i< n; i++) {
//         }
//         System.out.println(arr[i][j]);
//         }
//         int sum = 0;
//         for(int i=0; i< n; i++) {
//             sum += arr[i][i];
//         }
//         System.out.println(sum);

        

//     }
  
  
// package lect2;

public class matrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        int sum=0;
        for(int i=0;i<3;i++){
            sum+= arr[i][i];
        }   
        System.out.println(sum);           
    }

    
}