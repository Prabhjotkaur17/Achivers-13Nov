import java.util.Scanner;
public class Prime_factor {
    public static boolean prime(int data)
    {
        int c=0;
        for(int i=1;i<=data;i++)
        {
            if(data%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
    }
        return false;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int r=0;
        System.out.println("Enter number");
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(prime(i));
                {
                    r=i;
                }
            }
        }
        System.out.println("Highest : "+r);
    }
}
