import java.util.*;
public class Max 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int max=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				int num=j-i;
				if(num==k)
				{
					for(int m=i;m<j;m++)
					{
						max=0;
						for(int l=i;l<j;l++)
						{
							if(arr[l]>max)
							{
								max=arr[l];
							}
						}
						System.out.print(max+" ");
					}
				}
			}
		}
	}

}
