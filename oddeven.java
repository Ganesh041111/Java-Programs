import java.util.Scanner;

public class oddeven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String s = (num%2==0)?"It's an even number!":"It's an odd number!";
        System.out.println(s);
        
    }
}