//

public class Substring {
    static void subset(String p, String up) {
        //base case
        if(up.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);

        //include
        subset(p + ch , up.substring(1));
        //exclude
        subset(p , up.substring(1));
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(" ", str);
    }
}
