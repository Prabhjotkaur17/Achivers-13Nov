import java.util.Scanner;
public class greater {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
                int l=sc.nextInt();
                int temp=0;
                int a[]= new int[n];
                for(int i=0;i<n;i++)
                {
                    a[i]=sc.nextInt();
                }
                for(int i=0;i<n;i++)
                {
                    for(int j=i;j<n;j++)
                    {
                        for(int k=i;k<=j;k++)
                        {
                            if(a[k]>l)
                            {
                                temp++;
                                break;
                            }
                        }
                    }
                }
                System.out.println(temp);
    }
}
