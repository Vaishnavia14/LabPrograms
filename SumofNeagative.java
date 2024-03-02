package week5;
import java.util.Scanner;
public class SumofNeagative {
			public static void main(String args[])
			{
				Scanner sc=new Scanner (System.in);
				System.out.println("Enter number of elements");
				int n = sc.nextInt();
				System.out.println("Enter array elements");
				int arr[]=new int[n];
				for (int i=0;i<n;i++)
			{
					arr [i]=sc.nextInt ();
			}
			int suml=0;
			for (int i=0;i<n;i++)
			{
			if(arr[i]<0)
			suml+=arr[i];
			}
			System.out.println("The sum of negative numbers="+suml);
			sc.close();
			}
}
