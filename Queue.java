import java.util.*;

public class Queue {
    int arr[];
    int Front, Rear;

    Queue() {
        arr = new int[5];
        Front = -1;
        Rear = -1;
    }

    void insert() {
        if (Rear == arr.length - 1 || Rear == 4) {
            System.out.println("Queue full ");
        } else {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter any data");
            int data = sc2.nextInt();

            Rear = Rear + 1;
            arr[Rear] = data;
            if (Front == -1) {
                Front = 0;
            }
            System.out.println("  data inserted..  ");
        }
    }

    void delete() {
        if (Front == -1 || Rear == -1) {
            System.out.println("Singly queue empty ");
        } else {
            System.out.println("deleted :  " + arr[Front]);

            if (Front == Rear) {
                Front = -1;
                Rear = -1;
            } else if (Front < Rear) {
                Front = Front + 1;
            }
        }
    }

    void traverse() {
        if (Front == -1 || Rear == -1) {
            System.out.println("Singly Queue empty ");
        } else {
            System.out.println("--------------Single Queue  element--------------------");
            for (int i = Front; i <= Rear; i++) {
                System.out.print(" " + arr[i]);
            }
        }
    }

    void search() {
        if (Front == -1 || Rear == -1) {
            System.out.println("Singly queue empty ");
        } else {

        }
    }

    void peek() {
        if (Rear == arr.length - 1) {
            System.out.println("Queue empty ");
        } else {
            System.out.println("Last/Rear element " + arr[Rear]);
        }
    }

    void poll() {
        if (Rear == -1) {
            System.out.println("Queue empty ");
        }
    }

    public static void main(String[] args) {
        Queue obj = new Queue();
        while (true) {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for search");
            System.out.println("press 5 for PEEK");
            System.out.println("press 6 for POLL");
            System.out.println("press 7 for exit");

            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == 1) {
                obj.insert();
            } else if (choice == 2) {
                obj.delete();
            } else if (choice == 3) {
                obj.traverse();
            } else if (choice == 4) {
                obj.search();
            } else if (choice == 5) {
                obj.peek();
            } else if (choice == 6) {
                obj.poll();
            } else if (choice == 7) {
                System.exit(0);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
