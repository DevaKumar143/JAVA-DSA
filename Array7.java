import java.util.*;


public class Array7 {
    void func()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int arr[] = new int[5];

        //input
        System.out.println("Enter elements in array ");
        for(int i =0;i<arr.length;i++){
        arr[i] = sc.nextInt();
        }

        //output
        System.out.println("---------------Array element -------------");
        for(int var: arr)
        {
            System.out.println(var);
        }
    }public static void main(String[] args) {
        Array7 obj = new Array7();
        obj.func();
    
    }
    
}
