import java.util.Scanner;

public class Panagram {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String str,str1,result="";
     str=in.nextLine();
     str1=str.toLowerCase();
     for(char i='a';i<'z';i++)
     {
         if(str1.contains(""+i))
         {
            result="the given string is a panagram";
         }
         else
         {
               result="the given string is not a panagram";
         }
     }
     System.out.println(result);
    }
}
