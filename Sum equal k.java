import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i=0;i<n;i++){
		    int sum = 0;
		    for(int j=i;j<n;j++){
		        sum+=arr[j];
		        if(sum == k){
                System.out.println("Start Index : "+i+" Ending Index : "+j);
		            break;
		        }
		        if(sum>k){
		            break;
		        }
		    }
		}
	}
}
