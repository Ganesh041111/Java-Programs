import java.util.Scanner;

public class sunnynumber{

    public static boolean sunny(int n){
        if((Math.sqrt(n+1))%1==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = sunny(num);
        if(result==true){
            System.out.println("Givn number "+num+ " is Sunny number.");
        }
        else{
            System.out.println("Givn number "+num+ " is not a Sunny number.");
        }
    }
}