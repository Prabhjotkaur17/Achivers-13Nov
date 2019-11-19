import java.util.*;
public class ArrayFrequency {
public static void main(String args[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	int freq[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		freq[i]=0;
	}
                int count=1;
	for(int i=0;i<n;i++)
	{
		count=1;
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j]&&freq[j]==0)
			{
				count++;
				freq[j]=1;
			}
		}
		if(freq[i]!=1)
		{
			System.out.println(a[i]+" "+count);
		}
	}
	
			
}
}
