import java.util.Scanner;
class Ifelse
{
	public static void main(String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		a=s.nextInt();
		if(a%2==0)
		{
		System.out.println(a+" is an Even number");
		}
		else
		{
		System.out.println(a+" is an Odd number");
		}
	}
}	
