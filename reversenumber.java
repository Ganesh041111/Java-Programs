import java.util.Scanner;

public class reversenumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String revnum="";

        while(num>0){
            revnum=revnum+String.valueOf(num%10);
            num=num/10;
        }
        System.out.println(revnum);

    }
}