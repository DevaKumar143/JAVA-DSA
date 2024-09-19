import java.util.*;

public class Array8 {
    void func() {
        String cities[] = new String[5];
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter city name");
        // for (int i = 0; i < cities.length; i++) {
        //     cities[i] = sc.next();
        // }
        int i =0;
        while (i<cities.length) {
            cities[i] = sc.next();
            i++;
        }
        // output
        System.out.println("-----------Array String elements -----------------");
        // for (String c : cities) {
        //     System.out.println(c);
        // }
        int j =0;
        while(j<cities.length){
            System.out.println(cities[j]);
            j++;
        }

    }

    // static public void main(String...abcd) {
    public static void main(String[] args) {
        Array8 obj = new Array8();
        obj.func();
    }
}
