package day2assignment;


    class LinkedList {
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

        // Function to print the middle of the linked list
        void printMiddle() {
            Node slow = head;
            Node fast = head;

            if (head != null) {
                while (fast != null && fast.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;
                }
                System.out.println("The middle element is [" + slow.data + "]");
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
            LinkedList list = new LinkedList();
            for (int i = 1; i <= 7; i++) {
                list.addToTheLast(new Node(i));
            }
            list.printList();
            list.printMiddle();
        }
    }


