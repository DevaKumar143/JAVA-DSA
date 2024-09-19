import java.util.Scanner;;

public class Linearsearch {

     void Linearsearch ()
    {
        // declaration
        int arr[] = new int[5];
        int i;
        int sea;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter elements in array ");
        for( i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the searching element");
        sea=sc.nextInt();

        // process
        for( i=0;i<arr.length;i++){
            if(arr[i] == sea){
                count++;
            }
        }

        // output
        if(count>0){
            System.out.println("Found " + count+ " times");
        }else{
            System.out.println("Not Found " + count + " times");
        }
    }
    public static void main(String[] args) {
        Linearsearch obj = new Linearsearch();
        obj.Linearsearch();

    }
}
