
import java.util.Scanner;


public class Pal {

    public static void main(String[] args) {
        int n,r,sum=0;
        Scanner in=new Scanner(System.in);
         System.out.println("Enter the number");
        n=in.nextInt();
        int x=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10; 
        }
        if(sum==x)
            
            System.out.println(sum+" number is a palindrome ");
        else
        System.out.println(sum+" number is not a palindrome ");
        
    }
    
}
