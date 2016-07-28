import java.util.Scanner;
class Max
{
	public static void main(String arg[])
       {
		Scanner in=new Scanner(System.in);
		int x,y,z,max;
		System.out.print("Enter the three nos:");
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		if(x>y)
		{
			if(x>z)
				max=x;
			else
				max=z;
		}
		else if(y>z)
			max=y;
		else
			max=z;
		max=((x>y)?(x>z)?x:z:(y>z)?y:z);
		System.out.println("max is :"+max);
	}
}