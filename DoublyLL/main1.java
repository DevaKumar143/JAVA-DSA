package DoublyLL;

import java.util.*;

public class main1 {
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

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println("User ID: " + current.userId + ", Name: " + current.name);
            current = current.next;
        }
    }

    public void prepend(int userId, String name) {
        Node newNode = new Node(userId, name);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void remove(int userId) {
        Node current = head;
        while (current != null) {
            if (current.userId == userId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }
}

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.append(1, "Alice");
        dll.append(2, "Bob");
        dll.prepend(0, "Zara");

        System.out.println("Doubly Linked List:");
        dll.display();

        dll.remove(1);
        System.out.println("\nAfter removing user with ID 1:");
        dll.display();
    }
}
