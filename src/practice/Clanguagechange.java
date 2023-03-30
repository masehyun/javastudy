package practice;
import java.util.Scanner;

public class Clanguagechange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,num,num2;
        int ar[]=new int[100];
        int tmp;
        int start;
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        m=sc.nextInt();
        num=sc.nextInt();
        start = ar[num];
        for(int i=0;i<m-1;i++)
        {
            num2=sc.nextInt();
            tmp=ar[num2];
            ar[num2]=start;
            start=tmp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf(" %d",ar[i]);
        }
    }
}
