import java.util.*;
public class Sum_equals_x {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        int a[]= new int[A];
        int B=sc.nextInt();
        int b[]= new int[B];
        int x=sc.nextInt();
        System.out.println("First array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.println("Second array");
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]+b[j]==x)
                {
                    System.out.print(a[i]+"  "+b[j]);
                }
            }
        }
    }
}
