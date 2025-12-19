package CollectionFramework.LinkedList.StacksDir;

import java.util.Stack;

public class CpyStackSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=5;i++){
            st.push(i);
        }
        System.out.println(st);

        Stack<Integer> st1 = new Stack<>();
        while (st.size()!=0){
            st1.push(st.pop());
        }
        System.out.println("old stack "+st);
        System.out.println("new stack "+st1);

        Stack<Integer> st2 = new Stack<>();
        while (st1.size()!=0){
            st2.push(st1.pop());
        }
        System.out.println(st2);
    }
}
