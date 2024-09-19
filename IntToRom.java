import java.util.*;
public class IntToRom {
    public static String intToRoman(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i =0;
        String str = new String(); 
        while (num>0){
            if (num>=n[i]){
                str=str+s[i];
                num-=n[i];
            } else{
                i++;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        // System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(intToRoman(num));
    }




    //make tow array equal by reversing
    public boolean canBeEqual(int[] targetArray, int[] currentArray) {
        int[] elementCounts = new int[1001];
        int uniqueCount = 0;
        
        for (int i = 0; i < targetArray.length; i++) {
            if (elementCounts[targetArray[i]]++ == 0) uniqueCount++;
            if (elementCounts[currentArray[i]]-- == 1) uniqueCount--;
        }
        
        return uniqueCount == 0;
    }
}
