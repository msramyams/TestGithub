import java.util.Scanner;
public class Vowel 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the  character :");
		Scanner sc=new Scanner(System.in);
		char x=sc.next().charAt(0);
		if(x=='a'|| x=='e'||x=='i'|| x=='o'||x=='u')
		{
			System.out.println("vowel");
		}
		else
			System.out.println("consonant");

	}

}
