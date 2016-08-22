import java.util.Scanner;

public class Rev {

    public static void main(String[] args) {
       
        int n,rev=0;
   
        Scanner in=new Scanner(System.in);
         System.out.println("Enter the integer");
        n=in.nextInt();
        while(n!=0)
        {
             rev=rev*10;
             rev =rev+n%10;
             n = n/10;
    }
    System.out. println(rev);
    }
    
}
