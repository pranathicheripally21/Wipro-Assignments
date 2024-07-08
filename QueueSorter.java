package day2assignment;


    import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

    public class QueueSorter {
        public static void sortQueue(Queue<Integer> queue) {
            Stack<Integer> stack = new Stack<>();

            while (!queue.isEmpty()) {
                int temp = queue.poll();

                // Move elements from stack to queue until we find the right position for temp
                while (!stack.isEmpty() && stack.peek() > temp) {
                    queue.add(stack.pop());
                }

                // Push the current element to the stack
                stack.push(temp);
            }

            // Transfer elements back to the queue, which will be sorted in ascending order
            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
        }

        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(34);
            queue.add(3);
            queue.add(31);
            queue.add(98);
            queue.add(92);
            queue.add(23);

            System.out.println("Original Queue: " + queue);

            sortQueue(queue);

            System.out.println("Sorted Queue: " + queue);
        }

}
