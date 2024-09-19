public class Array {
    void func()
    {
       int arr[];
       arr = new int[5];
       arr[0] = 10;
       arr[1] = 15;
       arr[2] = 34;
       arr[3] = 46;
       arr[4] = 49;

       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
       System.out.println("Total Number of Element  "+arr.length);
    }
    public static void main(String[] args) {
        Array obj = new Array();
        obj.func();
    }
}
