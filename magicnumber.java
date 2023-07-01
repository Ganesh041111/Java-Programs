import java.util.Scanner;

public class magicnumber{
    public static int magic(int num, int ans){
        while(num>0){
            ans=ans+(num%10);
            num=num/10;
        }
        
        if(ans>9){
            num=ans;
            ans=0;
            System.out.println(num+" "+ans);
            magic(num,ans);
        }
        System.out.println(num+" "+ans);
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int ans=0;
        int val=magic(num,ans);
        if(val==1){
            System.out.println("Given number "+num+" is a magic number."+val);
        }
        else{
            System.out.println("Given number "+num+" is not a magic number."+val);
        }
    }
}