import java.util.*;

public class array10 {
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        // input
        System.out.println("Enter elements in array ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // process
        int pos =0;
        int neg = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println("Positive number :" + pos);
        System.out.println("Negative Number is :" + neg);
    }
    public static void main(String[] args) {
        array10 obj = new array10();
        obj.func();
        
    }
}
