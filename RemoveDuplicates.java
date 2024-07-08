package day3assignment;

public class RemoveDuplicates {

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

        // Function to remove duplicates from a sorted linked list
        void removeDuplicates() {
            Node current = head;

            // Traverse the list till the last node
            while (current != null && current.next != null) {
                if (current.data == current.next.data) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }

        // Utility function to insert a new Node at the end
        public void addToTheLast(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        // Utility function to print the linked list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            RemoveDuplicates list = new RemoveDuplicates();
            list.addToTheLast(new Node(1));
            list.addToTheLast(new Node(1));
            list.addToTheLast(new Node(2));
            list.addToTheLast(new Node(3));
            list.addToTheLast(new Node(3));
            list.addToTheLast(new Node(4));
            list.addToTheLast(new Node(4));
            list.addToTheLast(new Node(4));
            list.addToTheLast(new Node(5));

            System.out.println("Original List:");
            list.printList();

            list.removeDuplicates();

            System.out.println("List after removing duplicates:");
            list.printList();
        }
    }


