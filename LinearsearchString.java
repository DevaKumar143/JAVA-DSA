import java.util.Scanner;

public class LinearsearchString {

    LinearsearchString() {

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
        for (String var : names) {
            if (var.equalsIgnoreCase(sea)) {
                count++;
                // break; 
            }
        }

        // output
        if (count > 0) {
            System.out.println(" Found ");
        } else {
            System.out.println(" Not Found ");
        }
    }

    public static void main(String[] args) {
        LinearsearchString obj = new LinearsearchString();
    }
}
