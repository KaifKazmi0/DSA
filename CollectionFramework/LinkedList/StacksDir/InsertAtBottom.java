package CollectionFramework.LinkedList.StacksDir;

import java.util.Stack;

public class InsertAtBottom {
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

        st.push(0);
        while (st1.size()!=0){
            st.push(st1.pop());
        }
        System.out.println("updated stack: "+st);

    }
}
