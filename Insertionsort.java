import java.util.*;

public class Insertionsort {
    void func() {
        // declaration
        int arr[] = new int[5];
        int i, r, c, temp;
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter element in array");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // process
        //    pass
        for(r =1;r<arr.length;r++) 
        {
            //comp .. column
            for(c=0;c<r;c++)
            {
                //condtiom for swapping
                if(arr[c]>arr[r])
                {
                    //swap
                    temp = arr[c];
                    arr[c] = arr[r];
                    arr[r] = temp;
                }
            }
        }
        // output
        System.out.println("-------------Sorted array using insertion sort------------");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Insertionsort obj = new Insertionsort();
        obj.func();
    }
}
