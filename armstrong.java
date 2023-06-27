import java.util.Scanner;
import java.lang.Math;

public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int ans = num;
        String t = String.valueOf(num);
        int n = t.length();
        int val=0;
        // int a=num/10;
        while (num>0){
            int b = num%10;
            int temp = (int)Math.pow(b,n);
            val+=temp;
            num=num/10;
        }
        if(val==ans){
            System.out.println("Given number is an Armstrong Number!!");
        }
        else{
            System.out.println("Given number is NOT an Armstrong Number!!");
        }
    }
}