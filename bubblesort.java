import java.util.Scanner;

public class bubblesort{
    public static int[] bubble(int[] myarr){
        int c=myarr.length-1;
        for(int i=1;i<myarr.length;i++){
            for(int j=0;j<c;j++){
                if(myarr[j]>myarr[j+1]){
                    int temp=myarr[j];
                    myarr[j]=myarr[j+1];
                    myarr[j+1]=temp;
                }
            }
            c=c-1;
        }
        return myarr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int myarr[] = new int[n];
        System.out.println("Enter the numbers in array: ");
        for(int i=0;i<n;i++){
            myarr[i]=sc.nextInt();
        }
        int ans[]=bubble(myarr);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
            System.out.print(" ");
        }

    }
}