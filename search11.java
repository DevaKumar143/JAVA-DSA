
import java.util.Scanner;

public class search11 {
    class Node {
        int userId;
        String name;
        Node prev;
        Node next;

        public Node(int userId, String name) {
            this.userId = userId;
            this.name = name;
            this.prev = null;
            this.next = null;
        }
    }

    class DoublyLinkedList {
        private Node head;
        private Node tail;

         public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void append(int userId, String name) {
            Node newNode = new Node(userId, name);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        void delete(){
            if (userId == null && name == null) {
                System.out.println("List empty ");
            } else if (userId.next == null && userId.previous == null || name.next == null && name.previous ) {
                userId = null;
                name = null;
            } else {
                System.out.println("deleted :" + userId.data + name );
                UserId = UserId.next;
                UserId.previous = null;

                name = name.next;
                
                    
                }
            }
        }

        public void display() {
            Node current = head;
            while (current != null) {
                System.out.println("User ID: " + current.userId + ", Name: " + current.name);
                current = current.next;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            search11 dll = new search11();

            System.out.println("Enter the number of users:");
            int n = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 0; i < n; i++) {
                System.out.println("Enter user ID:");
                int userId = scanner.nextInt();
                scanner.nextLine(); 

                System.out.println("Enter user name:");
                String name = scanner.nextLine();

                // dll.append(userId, name);
            }

            System.out.println("\nDoubly Linked List:");
            // dll.display();

            scanner.close();
        }
    }

}
