import java.util.*;

public class array9 {

    static int arr[] = { 10, 32, 45, 90, 98 };

    static int largest() {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    static int smallest() {
        int i;
        int min = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    static void print2ndlargest(int arr[], int arr_size) {
        int i, second;
        if (arr_size < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }
        int largest = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            largest = Math.max(largest, arr[i]);
        }
        for (i = 0; i < arr_size; i++) {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.printf("There is no second " + "largest element\n");
        else
            System.out.printf("The second largest " + "element is %d\n", second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Largest element is " + largest());
        int n = arr.length;
        print2ndlargest(arr, n);
        System.out.println("Smallest element is :" + smallest());
    }
}