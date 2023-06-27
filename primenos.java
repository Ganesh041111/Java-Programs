import java.util.Scanner;

public class primenos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int flag=0;
        if(num == 1){
            System.out.println("It's neither a prime number nor composite!!");
        }
        else if(num == 2){
            System.out.println("It's a prime number!!");
        }
        else{
            for(int i=2;i<num/2;i++){
            if(num%i==0){
                flag=1;
                break;
            }
            }
            if(flag==0){
                System.out.println("It's a prime number!!");
            }
            else{
                System.out.println("It's NOT a prime number!!");
            }
        }
        
    }
}