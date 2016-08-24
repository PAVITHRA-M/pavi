import java.util.Scanner;

public class Bintodec 
{

    public static void main(String[] args) 
     {
       Scanner in=new Scanner(System.in);
       int n;
       String s;
       System.out.println("Enter the numbers");
       n=in.nextInt();
       s=Integer.toBinaryString(n);
       System.out.println(s);
       
     }
    
}
