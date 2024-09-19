import java.util.Arrays;
import java.util.Scanner;

public class mergearr {
    void func(){
         Scanner sc = new Scanner(System.in);
         int arr[] = new int[5];
         int br[] = new int[5];
         int cr[] = new int[10];

        //  input
        System.out.println("Enter elements in Ist array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter elements in IInd array");
        for(int j=0;j<br.length;j++){
            br[j] = sc.nextInt();
        }
         
        // int arr1 =arr.length;
        // int arr2 = br.length;

        // int arr3 = arr1+arr2;
        // process
        int j=5;
        for(int i=0;i<arr.length;i++){
            if(i<5){

            }
            
        }

        // output
        System.out.println("\n -----------------Merged array --------------");
        for(int var : cr){
            System.out.println(var);
        }
    }
    public static void main(String[] args) {
        mergearr obj = new mergearr();
        obj.func();
    }
}






























    // public static void main(String[] args) {
    //     int arr1[] = {5,3,4,6,7,9};
    //     int arr2[] = {4,6,4,8,6,4};

    //     int a1 = arr1.length;
    //     int a2 = arr2.length;

    //     int c = a1+a2;

    //      int[] d = new int[c];

    //      System.out.println(arr[]);
        
    // }

