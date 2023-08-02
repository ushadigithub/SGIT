import java.util.Stack;

public class DisplayOfStackContents {
    public static void displayStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty:");
            return;
        }
        System.out.println("Stack contents:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(67);
        stack.push(98);
        stack.push(32);
        displayStack(stack);
    }
}
