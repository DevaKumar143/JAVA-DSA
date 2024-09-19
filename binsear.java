import java.util.Scanner;

public class binsear {
    void func() {
        // declaration
        int arr[] = new int[10];
        int i, sea;
        int lb = 0;
        int ub = arr.length-1;
        int mid;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        // input

        System.out.println("Enter elements in array");
        for (i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Searching elements");
        sea = sc.nextInt();

        // process binary search
        while (lb<=ub) {
             mid = (lb+ub)/2;
             if(arr[mid]==sea)
             {
                count++;
                break;
             }
             else if(arr[mid]<sea){
                ub = mid-1;
             }else if(arr[mid]>sea){
                lb = mid+1;
             }
        }

        // output
        if (count > 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found ");
        }

    }

    public static void main(String[] args) {
        binsear obj = new binsear();
        obj.func();
    }
}
