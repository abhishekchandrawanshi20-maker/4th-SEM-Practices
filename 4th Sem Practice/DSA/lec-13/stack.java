import java.util.Scanner;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();

         Stack <Integer> st2 = new Stack<>();

        st2.push(10);
        st2.push(20);       
        st2.push(30);
        st2.push(40);
        st2.push(50);
        int max=0;
        int min=st2.peek();
        int a;

        while(!st2.isEmpty()){
            a=st2.pop();
            max=Math.max(max,a);
            min=Math.min(min ,a);
        }

        System.out.println(max);
        System.out.println(min);



        // int key = 20;
        // if(st2.contains(key)){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("not Found");
        // }



        // Stack <Integer> st = new Stack<>();
        // st.push(20);
        // st.push(30);
        // st.push(40);
        // st.push(50);
        // st.push(50);
        // st.push(50);
        // st.push(50);
        // st.push(50);
        // System.out.println(st);
        // System.out.println("Removed value: " + st.pop());
        // System.out.println(st.peek());
        // System.out.println(st.isEmpty());
        // System.out.println(st.size());
        // System.out.println(st);
        // while (!st.isEmpty()); {
        //     System.out.println(st.pop());
        // }
        // String str = "Hello World";
        // Stack <Character> st1 = new Stack<>();
        // for(char ch : str.toCharArray()) {
        //     st1.push(ch);
        // }
        // while (!st1.isEmpty()) {
        //     System.out.print(st1.pop());
        // }

       
        // System.out.println(st2);
        // Stack<Integer> st1= new Stack<>();
        // st1.addAll(st2);
        // System.out.println(st1);
        // int count = 0;
        // while (!st2.isEmpty()) {
        //     // System.out.println(st2.pop();
        //     st2.pop();
        //     count++;
        // }
        // System.out.println("Size of stack: " + count);


    }
}

