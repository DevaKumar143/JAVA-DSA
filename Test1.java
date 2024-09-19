import java.util.Scanner;

import java.util.*;

public class Test1 {
    class student
    {
        int id;
        String name;
        student next;
    }
    void insertdata(){
        System.out.println("Enter any data ");
        Scanner sc2 = new Scanner(System.in);
        int id = sc2.nextInt();
        String name = sc2.next();


    }
    void traverse(){

    }
    void search(){
        if (id ==null || name == null){
            System.out.println("List are empty");
        }

    }

    public static void main(String[] args) {
        Test1 obj = new Test1();
        while (true) {
            System.out.println("\nPress 1 for insert data ");
            System.out.println("press 2 for traverse ");
            System.out.println("press 3 for search");
            System.out.println("press 4 for EXIT");



             System.out.println("Enter your choice ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.insertdata();
                    break;
                   
                case 2:
                obj.traverse();
                    break;
                case 3:
                    obj.search();
                    break;
                 case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }

    }
}
