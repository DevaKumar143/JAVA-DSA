import java.util.*;

public class doublyLL {
    class Node {
        int data;
        Node next;
        Node previous;
    }

    Node START;

    doublyLL() {

    }

    void addnode() {
        System.out.println("Enter any data ");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();

        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        nn.previous = null;

        if (START == null) // when list does not exist
        {
            START = nn;
        } else {
            Node current = START;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nn;
            nn.previous = current;

        }
        System.out.println("data inserted..");

    }

    void deletenode() {
        if (START == null) {
            System.out.println("List empty ");
        } else if (START.next == null && START.previous == null) {
            START = null;
        } else {
            System.out.println("deleted :" + START.data);
            START = START.next;
            START.previous = null;
        }

    }

    void traverse() {
        if (START == null) {
            System.out.println("list empty ");
        } else {
            Node end = null;
            System.out.println("-------Forward mode-----------");
            for (Node i = START; i != null; i = i.next) {
                end = i;
                System.out.print(" " + i.data);
            }
            System.out.println("----------------Reverse mode-----------");
            while (end != null) {
                System.out.print(" " + end.data);
                end = end.previous;
            }
        }

    }

    void search() {
        if (START == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Enter searching element ");
        Scanner sc3 = new Scanner(System.in);
        int sea = sc3.nextInt();
        Node current = START;
        while (current != null) {
            if (current.data == sea) {
                System.out.println("Element " + sea + " found in the list.");
                return;
            }
            current = current.next;
        }
        System.out.println("Element " + sea + " not found in the list.");
    }

    void seclast() {

        if (START == null || START.previous == null) {
            System.out.println("List doesn't have enough elements.");
            return;
        }
        Node secondLast = START.previous;
        System.out.println("The second last element is: " + secondLast.data);
    }

    void swap(){
        System.out.println("Enter two elements");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(" The value of a is " + a);
        System.out.println(" The value of b is " + b);
    }

    public static void main(String[] args) {
        doublyLL obj = new doublyLL();
        while (true) {
            System.out.println("\nPress 1 for insert ");
            System.out.println("Press 2 for delete");
            System.out.println("press 3 for traverse ");
            System.out.println("press 4 for search");
            System.out.println("press 5 for seclast");
            System.out.println("press 6 for swap");
            System.out.println("press 7 for EXIT");

            System.out.println("Enter your choice ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.addnode();
                    break;

                case 2:
                    obj.deletenode();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.search();
                    break;
                case 5:
                    obj.seclast();
                    break;
                case 6:
                     obj.swap();
                     break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
