import java.util.*;
public class SubArray 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int max=0;
				for(int l=i;l<=j;l++)
				{
					if(arr[l]>max)
					{
						max=arr[l];
					}
				}
				if(max>k)
				{
					count++;
				}
			}
		}
		System.out.print(count+" ");
	}

}
