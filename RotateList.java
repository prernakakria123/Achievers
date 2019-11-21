import java.util.*;
class node
{
	int data;
	node address=null;
}
public class RotateList 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		node start=null;
		node ptr=null;
		for(int i=0;i<n;i++)
		{
			node temp=new node();
			temp.data=sc.nextInt();
			temp.address=null;
			if(start==null)
			{
				start=temp;
			}
			else
			{
				ptr=start;
				while(ptr.address!=null)
				{
					ptr=ptr.address;
				}
				ptr.address=temp;
			}
		}
		int k=sc.nextInt();
		node pos=start;
		node prev=null;
		while(k>0)
		{
			prev=pos;
			pos=pos.address;
			k--;
		}
		node last=start;
		while(last.address!=null)
		{
			last=last.address;
		}
		last.address=start;
		start=pos;
		prev.address=null;
		node ref=start;
		while(ref!=null)
		{
			System.out.print(ref.data+" ");
			ref=ref.address;
		}
		
		
	}
	
}
