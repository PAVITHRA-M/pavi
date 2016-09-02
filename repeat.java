import java.util.Scanner;

public class Repeat {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n,c=0;
     n=in.nextInt();
     int[] a=new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]=in.nextInt();
     }

         for(int j=1;j<a.length;j++)
         {
             if(a[0]==a[j])
             {
                 c++;
                 break;
             }
             
         }
         if(c==0)
         System.out.println("not repeated");
         else
         {
             System.out.println("repeated");
         }
     }
     
    }
    
