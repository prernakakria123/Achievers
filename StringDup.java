import java.util.*;
public class StringDup 
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res="";
		if(str.charAt(0)!=str.charAt(1))
		{
			res=res+str.charAt(0);
		}
		for(int i=1;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i-1)&&str.charAt(i)!=str.charAt(i+1))
			{
				res=res+str.charAt(i);
			}
		}
		if(str.charAt(str.length()-1)!=str.charAt(str.length()-2))
			res=res+str.charAt(str.length()-1);
		System.out.println("Resultant String: "+res);
	}
}
