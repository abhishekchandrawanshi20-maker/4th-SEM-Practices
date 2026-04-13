// find the maximum elemnt of array

public class maxarry {
    static int maxnumofarray(int[] arr, int i){
        if(i == arr.length -1)
            return arr[i];
        int smallAns = maxnumofarray(arr ,i+1); 
        return  Math.max(arr[i],smallAns);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9,12,15};

        System.out.println(maxnumofarray(arr, 0));
    }
}