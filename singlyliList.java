import java.util.*;

public class singlyliList {

    class Node // node structure
    {
        int data;
        Node next;
    }

    Node START;

    singlyliList() {
        START = null;
    }

    void addnode() {
        System.out.println("Enter any data");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();

        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (START == null) // when list does not exit
        {
            START = nn;
        } else {
            Node current = START;
            while (current.next != null) {
                current = current.next;

            }
            current.next = nn;
        }
        System.out.println("data inserted ..");
    }

    void deletenode() {
        if (START == null) {
            System.out.println("List empty ");
        }
    }

    void traverse() {
        if (START == null) {
            System.out.println("List empty ");
        } else {
            System.out.println("-----List  element------");
            for (Node i = START; i != null; i = i.next) {
                System.out.println(" " + i.data);
            }
        }
    }

    void search() {
        if (START == null) {
            System.out.println("list empty ");
        } else {
            System.out.println("Enter searching element ");
            Scanner sc3 = new Scanner(System.in);
            int sea = sc3.nextInt();

            while (START != null) {
                if (START.data ==sea ) {
                    System.out.println("Element " + sea + " is present in the list.");
                    return;
                }
                START = START.next;
                System.out.println("Element " + sea + " is not present in the list.");
            }
        }
    }

    public static void main(String[] args) {
        singlyliList obj = new singlyliList();
        while (true) {
            System.out.println("Press 1 for insert ");
            System.out.println("Press 2 for delete ");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for search ");
            System.out.println("Press 5 for EXIT");

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
                    System.exit(0);
            }

        }
    }

}
