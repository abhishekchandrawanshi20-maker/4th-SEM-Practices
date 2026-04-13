// find the sum of digits of array

public class arrysum { 
    static int sumofarry(int[] arr,int i ){
      if(i==arr.length) 
        return 0;
    return arr[i] + sumofarry(arr , i+1);

    } 
    public static void main(String[] args){
       int arr[] = {1,2,3,4};
       int i = 0;
       System.out.println(sumofarry(arr, i));
    }
}
