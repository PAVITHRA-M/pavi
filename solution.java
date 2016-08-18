import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int j=1;j<=N;j++)
            {
        for(int i=1;i<=10;i++)
            {
            System.out.println(j+" x "+i+" = "+(j*i));
             }
        }
    }
}
