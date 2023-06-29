import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        String temp = "";
        for(int i=0;i<str.length();i++){
            char t = str.charAt(i);
            temp = t+temp;

        }
        if(temp.equals(str)){
            System.out.println("It's a palidrome!");
        }
        else{
            System.out.println("It's not a palidrome!");
        }
    }
}