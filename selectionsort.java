import java.util.Scanner;

public class selectionsort{
    public static int[] selection(int[] myarr){
        int k=myarr.length;

        for(int i=0;i<myarr.length-1;i++){
            int ptr=0;
            int sm=myarr[0];
            for(int j=0;j<k;j++){
                if(sm>myarr[j]){
                    sm=myarr[j];
                    ptr=j;
                }
            }
            int temp=myarr[ptr];
            myarr[ptr]=myarr[k-1];
            myarr[k-1]=temp;
            k=k-1;
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
        int ans[]=selection(myarr);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
            System.out.print(" ");
        }

    }
}