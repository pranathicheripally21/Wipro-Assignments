package day5assignment;

public class MergeTwoSortedLists {

        Node head; // head of the list

        // Linked list Node
        static class Node {
            int data;
            Node next;

            // Constructor to create a new node
            Node(int d) {
                data = d;
                next = null;
            }
        }

        // Function to merge two sorted linked lists
        static Node mergeSortedLists(Node l1, Node l2) {
            // Create a dummy node to simplify edge cases
            Node dummy = new Node(0);
            Node current = dummy;

            // Traverse both lists and append the smaller value to current
            while (l1 != null && l2 != null) {
                if (l1.data <= l2.data) {
                    current.next = l1;
                    l1 = l1.next;
                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }

            // Append the remaining nodes of l1 or l2
            if (l1 != null) {
                current.next = l1;
            } else {
                current.next = l2;
            }

            return dummy.next; // The merged list is after the dummy node
        }

        // Utility function to print the linked list
        public static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            // Creating first sorted linked list: 1 -> 3 -> 5
            MergeTwoSortedLists list1 = new MergeTwoSortedLists();
            list1.head = new Node(1);
            list1.head.next = new Node(3);
            list1.head.next.next = new Node(5);

            // Creating second sorted linked list: 2 -> 4 -> 6
            MergeTwoSortedLists list2 = new MergeTwoSortedLists();
            list2.head = new Node(2);
            list2.head.next = new Node(4);
            list2.head.next.next = new Node(6);

            // Print original lists
            System.out.println("List 1:");
            printList(list1.head);
            System.out.println("List 2:");
            printList(list2.head);

            // Merge the two sorted linked lists
            Node mergedHead = mergeSortedLists(list1.head, list2.head);

            // Print merged list
            System.out.println("Merged List:");
            printList(mergedHead);
        }


}
