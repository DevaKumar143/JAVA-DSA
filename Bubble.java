import java.util.*;
public class Bubble {
    void func(){

        // declaration
        int arr[] = new int[5];
        int r,c,i,temp;
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter element in array ");
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


        // process
        for(r=0;r<arr.length-1;r++){
            for(c=0;c<arr.length-1-r;c++){
                if(arr[c]<arr[c+1]){
                    // swap

                    temp = arr[c];
                    arr[c] = arr[c+1];
                    arr[c+1] = temp;
                }
            }
        }


        // output
        System.out.println("---------Sorted array using BubbleSort------------------");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Bubble obj = new Bubble();
        obj.func();
    }
}
