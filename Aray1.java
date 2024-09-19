public class Aray1 {
    void func() {
        // int arr[] = {10,20,30,40,50};
        // for(int i =0;i<5;i++){
        //     System.out.println(arr[i]);
        // }
        int arr[] = {10,20};
        int count = 0;

        for(int var :arr){
            System.out.println(var);
            count++;
        }
        System.out.println("Total no of items "+ count);
    }
    public static void main(String[] args) {
        Aray1 obj = new Aray1();
        obj.func();
    }
}
