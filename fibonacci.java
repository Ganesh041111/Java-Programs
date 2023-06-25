import java.util.Scanner;

public class fibonacci{
    public static int fibo(int a){
        if(a==1 || a==2){
            return 1;
        }
        else{
            return fibo(a-1)+fibo(a-2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int ans = fibo(a);
        System.out.println("Output is "+ ans);
    }
}