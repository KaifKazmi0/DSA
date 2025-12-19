package CollectionFramework.LinkedList.StacksDir.Impement;

public class StackDriver {
    public static void main(String[] args) {


        StackLL.Stack1 stack = new StackLL.Stack1();

        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        for (int i=1;i<=5;i++){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
