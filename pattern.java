import java.util.*;
public class pattern {
    public static void invertedpiramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                System.out.print(i+" ");
                // i++;
            }
            System.out.println();
        }
    }

    public static void floyd(int n) {
        int counter = 1;
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // invertedpiramid(n);
        
        floyd(n);
    }
}
