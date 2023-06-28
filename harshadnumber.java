import java.util.Scanner;

public class harshadnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int dupnum=num;
        int temp=0;
        while (num>0){
            temp=temp+(num%10);
            num=num/10;
        }
        if(dupnum%temp==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}