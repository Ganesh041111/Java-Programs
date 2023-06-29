import java.util.Scanner;

public class occurence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter a digit: ");
        int t = sc.nextInt();
        int count=0;

        while(num>0){
            int temp = num%10;
            num=num/10;
            if(temp==t){
                count+=1;
            }
        }

        System.out.println("Occurence of digit "+t+" in given number is: "+count);

    }
}