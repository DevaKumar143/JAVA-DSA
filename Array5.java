public class Array5 {
    void func() {
        String arr[] = { "10", "20", "30", "40", "50" };
        // int sum = 0;
        int sum =0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += Integer.parseInt(arr[i]);
        // }
        // System.out.println("total : " + sum);
        for(String x: arr)
        {
             sum += Integer.parseInt(x);
        }
        System.out.println("Total :"+sum);
    }

    public static void main(String[] args) {
        Array5 obj = new Array5();
        obj.func();
    }
}
