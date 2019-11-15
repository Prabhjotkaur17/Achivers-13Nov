import java.util.*;
public class ReverseString {
   public static void main(String []args)
   {
       Scanner input= new Scanner(System.in);
       String s= input.nextLine();
       int i=0;
       int j=s.length()-1;
       char a[]=s.toCharArray();
       while(i<j)
       {
          if(a[i]>=65 && a[i]<=90 || a[i]>=97 && a[i]<=122)
          {
              if(a[j]>=65 && a[j]<=90 || a[j]>=97 && a[j]<=122)
              {
                  char b=a[i];
                  a[i]=a[j];
                  a[j]=b;
                  i++;
                  j--;
              }
              else
              {
                  j--;
              }
          }
          else
          {
              i++;
          }
       }
       s=new String(a);
       System.out.print(s);
   }
}
