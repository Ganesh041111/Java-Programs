import java.util.Scanner;

public class factorial{

    public static int fact(int a){
        if(a==1 || a==0){
            return 1;
        }
        else{
            return fact(a-1)*a;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int ans = fact(a);
        System.out.println("Factorial of "+a+" is "+ ans);
    }
}