import java.io.*;
import java.lang.*;

class CompareString 
{
	public static void main(String[] args)  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the First String :");
		String s1 = br.readLine();
		System.out.println("Enter the Second String :");
		String s2 = br.readLine();

		if(s1.equals(s2))
		{
			System.out.println("Both the String are same : True");
		}
		else
		{
			System.out.println("Both the String are not same : False");
		}
			
	}
}
