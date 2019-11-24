import java.util.Scanner;
public class maxSubArray {
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=input.nextInt();
        System.out.println("Enter the elements of the array");
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= input.nextInt();
        }
        System.out.println("Enter the size of the sub array");
        int k=input.nextInt();
         for(int i=0;i<n-k+1;i++)
         {
             int max=a[i];
             for(int j=i;j<i+k;j++)
             {
                 if(a[j]>max)
                     max=a[j];
             }
             System.out.println(max+" ");
         }
    }
}
