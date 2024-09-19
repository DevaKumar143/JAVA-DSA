public class Array4 {
    void func() {
        int arr[] = {10,20,30,40,50,60};
        int sum = 0;
         for(int i =0;i<arr.length;i++){
            sum += arr[i];
         }
         System.out.println("Total sum of Array is : "+ sum);
    }
    public static void main(String[] args) {
        Array4 obj = new Array4();
        obj.func();
    }
}
