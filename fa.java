import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fa {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,fact=0;
        n=in.nextInt();
        fact=factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int x)
        {
        if(x==1)
        return 1;
        else
            return(x*factorial(x-1));
    }
        
        
        
        
        
    
}