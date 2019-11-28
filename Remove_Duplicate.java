import java.util.Scanner;
import java.util.Arrays;
public class Remove_Duplicate {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        char c[]=s.toCharArray();
        int n=s.length();
        if(c[0]!=c[1]){
            System.out.print(c[0]);
        }
        for(int i=1;i<n-1;i++){
            if(c[i]==c[i+1]){
                i++;
            }
            else if(c[i]!=c[i+1]){
                if(c[i]!=c[i-1]&&i>=1)
                    System.out.print(c[i]);
            }
        }
        if(c[n-1]!=c[n-2]){
            System.out.print(c[s.length()-1]);
        }
    }
}
