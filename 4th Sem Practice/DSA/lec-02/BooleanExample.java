public class BooleanExample{
    public static void main(String[] args) {
      
        int arr[][] = new int[3][4];
        
        boolean flag = false;
        for(int i=2; i<3; i++) {
            for( int j=0; j<4; j++) {
                if(arr[i][j] ==0)  {
                    flag = true;System.out.println("Found ");
                    break;
                } 
            }
        }
        if(!flag) {
            System.out.println("Not Found");
        }
    }
}