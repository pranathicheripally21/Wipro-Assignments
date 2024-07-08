package day3assignment;


    import java.util.Stack;

    public class StackSorter {
        public static void sortStack(Stack<Integer> stack) {
            Stack<Integer> tempStack = new Stack<>();

            while (!stack.isEmpty()) {
                // Pop an element from the original stack
                int temp = stack.pop();

                // While temporary stack is not empty and top of tempStack is greater than temp
                while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                    // Pop from tempStack and push it back to the original stack
                    stack.push(tempStack.pop());
                }

                // Push temp in sorted order
                tempStack.push(temp);
            }

            // Transfer from tempStack back to stack
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(34);
            stack.push(3);
            stack.push(31);
            stack.push(98);
            stack.push(92);
            stack.push(23);

            System.out.println("Original Stack: " + stack);

            sortStack(stack);

            System.out.println("Sorted Stack: " + stack);
        }

}
