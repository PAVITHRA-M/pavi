

import java.util.Scanner;

public class Srev 
{
    public static void main(String[] args)
 {
        String s;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        s=in.nextLine();
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());
        
        
    }
    
}
