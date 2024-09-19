
import java.util.Scanner;;

public class Linearsearch1 {

     void Linearsearch1 ()
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
        int index =0;
        for( i=0;i<arr.length;i++){
            if(arr[i] == sea){
                count++;
                index = i;
                System.out.println("Index : "+ index);
            }
        }


        // output
        if(count>0){
            System.out.println("Found at");
        }else{
            System.out.println("Not Found ");
        }
    }
    public static void main(String[] args) {
        Linearsearch1 obj = new Linearsearch1();
        obj.Linearsearch1();

    }
}

