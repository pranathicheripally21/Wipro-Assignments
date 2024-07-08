package day4assignment;
import java.util.Stack;
public class SequenceinStack {




        public static boolean isSequencePresent(Stack<Integer> stack, int[] sequence) {
            // Create a copy of the stack to avoid modifying the original stack
            Stack<Integer> tempStack = new Stack<>();
            tempStack.addAll(stack);

            int sequenceIndex = 0;
            int sequenceLength = sequence.length;

            // Traverse the stack
            while (!tempStack.isEmpty()) {
                int current = tempStack.pop();

                if (current == sequence[sequenceIndex]) {
                    sequenceIndex++;
                    if (sequenceIndex == sequenceLength) {
                        return true; // Sequence found
                    }
                } else {
                    // Reset the sequence index if current does not match the expected sequence element
                    sequenceIndex = 0;
                }
            }

            return false; // Sequence not found
        }

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            int[] sequence1 = {3, 4, 5}; // Example sequence to search
            int[] sequence2 = {1, 2, 4}; // Another example sequence to search

            System.out.println("Sequence 1 is present: " + isSequencePresent(stack, sequence1)); // Should return true
            System.out.println("Sequence 2 is present: " + isSequencePresent(stack, sequence2)); // Should return false
        }


}
