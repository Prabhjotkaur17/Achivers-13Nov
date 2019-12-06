import java.util.Scanner;
public class Chocolate {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Array size");
        int n= input.nextInt();
        int arr[]= new int [n];
        System.out.println("Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Student");
                int m=input.nextInt();
             for(int i=0;i<n;i++)
             {
                 for(int j=0;j<n-i-1;j++)
                 {
                     if(arr[j]>arr[j+1])
                     {
                         int temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                     }
                 }
             }
             int r= arr[m-1]-arr[0];
             System.out.println("Difference : "+ r);
    }
}
