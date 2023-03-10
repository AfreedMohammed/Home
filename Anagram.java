import java.util.*;
class Anagram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length()==s2.length())
		{
			char a1[]=s1.toCharArray();
			char a2[]=s2.toCharArray();
			//System.out.println(a1);
			//System.out.println(a2);
			Arrays.sort(a1);
			
			Arrays.sort(a2);
			System.out.println(a1);
			System.out.println(a2);
			//toString(a1);
			//toString(a2);
			if(Arrays.equals(a1,a2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
		else{
			System.out.println("the lengths are not equal");
		}
		
		
	}
}