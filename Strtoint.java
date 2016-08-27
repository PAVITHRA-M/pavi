import java.util.Scanner;

public class Strtoint {

  
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
     String str=in.nextLine();
     String str1=str.toUpperCase();
     int cnt=0;
   for(int i=0;i<str1.length();i++)
   {
       cnt=cnt+str1.charAt(i);
   
   }
   System.out.println(cnt);
  }