
// import java.io.SequenceInputStream;
import java.util.*;

public class selectionsort {
    void func() {
        // declaration
        int arr[] = new int[5];
        int i;
        int r, c, temp;
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter elements in array ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // process Selection sorting
        for (r = 0; r < arr.length; r++) {
            // no of comparision's
            for (c = r + 1; c < arr.length; c++) {
                // compare
                if (arr[r] > arr[c]) {
                    // swap
                    temp = arr[r];
                    arr[r] = arr[c];
                    arr[c] = temp;
                }
            }
        }

        // output print sorted array
        System.out.println("------------------Sorted Order ---------------------");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        selectionsort obj = new selectionsort();
        obj.func();
    }
}
