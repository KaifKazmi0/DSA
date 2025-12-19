package CollectionFramework.LinkedList.StacksDir;

import java.util.Arrays;
import java.util.Stack;

public class StackDisRecurr {
    static void displayRev(Stack<Integer> st){
        if(st.empty()){
            System.out.println();
            return;
        }
        int top = st.pop();
        System.out.print(top+" ");
        displayRev(st);
        st.push(top);
    }

    static void display(Stack<Integer> st){
        if(st.empty()){
            System.out.println();
            return;
        }
        int top = st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i=1;i<=5;i++){
            st.push(i);
        }
        System.out.println(st);
        displayRev(st);
        display(st);
        System.out.println(st);


//        int n = st.size();
//        int arr[] = new int[n];
//        for(int i=n-1;i>=0;i--){
//            arr[i] = st.pop();
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
