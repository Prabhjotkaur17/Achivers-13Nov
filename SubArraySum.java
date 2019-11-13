import java.util.Scanner;
import java.util.Arrays;
public class SubArraySum {
    public static void main(String [] args)
    {
        Scanner Input = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n=Input.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]= Input.nextInt();
        }
        int k=Input.nextInt();
        int sum=arr[0];
        int s=0,e=0;
        while(e<arr.length)
        {
            if(sum==k)
            {
                System.out.println("Starting index : "+s+" , ending index : "+e);
            }
            if(sum<=k)
            {
                e++;
                if(e<arr.length)
                {
                    sum=sum+arr[e];
                }
            }
            else
            {
                sum=sum-arr[s];
                s++;
            }
        }
    }
}
