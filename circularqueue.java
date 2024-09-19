import java.util.*;

public class circularqueue {
    int arr[];
    int Front, Rear;

    circularqueue() {
        arr = new int[5];
        Front = -1;
        Rear = -1;
    }

    void insert()
    {
        if((Front==0 && Rear==arr.length-1)||(Rear+1==Front)){
            System.out.println("circular queue full");
        }
        else{
            System.out.println("enter any data");
            Scanner sc2 = new Scanner(System.in);
            int data =sc2.nextInt();
            if(Front <=Rear && Rear!=arr.length-1){
                Rear=Rear+1;
                arr[Rear]=data;
                if(Front==-1){
                    Front=0;
                }
            }
            else if(Rear==arr.length-1&& Front!=0)//circular first element
            {
                Rear=0;
                arr[Rear]=data;

            }
            else if(Rear<Front){//circular second or next
                Rear= Rear+1;
                arr[Rear]=data;
            }
            System.out.println("data inserted-------");
        }

    }



    void delete() {
        if (Front == -1 || Rear == -1) {
            System.out.println("Circular queue empty ");
        } else {
            System.out.println("Delete : " + arr[Front]);
            if (Front == Rear) {
                Front = -1;
                Rear = -1;
            } else if (Front < Rear) {
                Front = Front + 1;
            } else if (Front == arr.length - 1 && Rear < Front) {
                Front = 0;
            } else if (Rear < Front) {
                Front += 1;
            }
        }
    }

    void traverse()
    {
        if(Front == -1 || Rear == 1)
        {
            System.out.println("Circular Queue Empty ");
        }
        else
        {
            System.out.println("--------Queue element's----------");
            if(Front<=Rear)
            {
                for(int i = Front; i<=Rear; i++)
                {
                    System.out.print(" " +arr[i]);
                }
            }
            else // circular situation 
            {
                for(int i = Front; i<= arr.length-1; i++)
                {
                    System.out.println(" " +arr[i]);
                }
                for(int j = 0; j<= Rear; j++)
                {
                    System.out.println(" " +arr[j]);
                }
            }
        }
    }



    void search() {

    }

    void peek() {
        if (Front == -1 || Rear == -1) {
            System.out.println("Circular queue empty ");
        }else{
            System.out.println("First element : "+arr[Front]);
        }
    }

    void poll() {

    }

    public static void main(String[] args) {
        circularqueue obj = new circularqueue();
        while ((true)) {
            System.out.println("Press 1 for insert ");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for peek/last element");
            System.out.println("Press 6 for poll / first element");
            System.out.println("Press 7 for EXIT");

            System.out.println("Enter your choice ");
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
                System.out.println("Wrong choice ");
            }
        }
    }
}
