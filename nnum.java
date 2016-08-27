import java.util.Scanner;


public class Nnum {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n,sum=0;
       System.out.println("enter the number");
       n=in.nextInt();
       int[] num=new int[n];
       for(int i=0;i<n;i++)
           num[i]=in.nextInt();
       for(int i=0;i<n;i++)
       {
           sum=sum+num[i];
       }
       System.out.println(sum);
    }
}
