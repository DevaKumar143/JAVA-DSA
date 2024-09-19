import java.util.Scanner;

public class Searchstring {

    Searchstring() {

        // declaration
        String names[] = new String[5];
        int i, count = 0;
        String sea;
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter elements in array");
        for (i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        System.out.println("Enter searching student name ");
        sea = sc.next();

        // process
        for( i=0;i<names.length;i++){
            if(names[i].equals  (sea)){
                System.out.println(sea);
                break;
            }else{
                System.out.println("Not Found");
                break;
            }
        }
        // for (String var : names) {
        //     if (var.equalsIgnoreCase(sea)) {
        //         count++;
        //         // break; 
        //     }
        // }

        // output
        // if (count > 0) {
        //     System.out.println("The String are found  " + sea);
        // } else {
        //     System.out.println(" Not Found ");
        // }
    }

    public static void main(String[] args) {
        Searchstring obj = new Searchstring();
    }
}
