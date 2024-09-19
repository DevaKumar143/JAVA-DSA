import java.util.Scanner;

public class Array6 {
    void func()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter I value");
      int var1 = sc.nextInt();

      System.out.println("Enter II value");
      int var2 = sc.nextInt();

      int sum = var1+ var2;
      System.out.println("Sum of two number is : "+ sum);
    }
    public static void main(String[] args) {
        Array6 obj = new Array6();
        obj.func();
    }
}
