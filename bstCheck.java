import java.util.Scanner;
public class bstCheck {
  static   Node root;
   static  class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    bstCheck()
    {
        root=null;
    }
    bstCheck(int data)
    {
        Node root=new Node(data);
    }
    public  void insert(int data)
    {
        root=insert_bst(root,data);
    }
    public static Node insert_bst(Node root,int data)
    {
        if(root==null)
        {
            root= new Node(data);
            return root;
        }
        else if(root.data>data)
        {
            root.left=insert_bst(root.left,data);
        }
        else if(root.data<data)
        {
            root.right=insert_bst(root.right,data);
        }
        return root;
    }
    public static boolean bstCheck(Node root,Node right,Node left)
    {
        if(root==null)
            return true;
        if(left !=null && root.data<=left.data)
        return false;
        if(right !=null && root.data>=right.data)
            return false;
        
        return bstCheck(root.left,left,root)&& bstCheck(root.right,root,right);
    }
    public static void main(String []args)
    {
        bstCheck  bst= new bstCheck();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=input.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            int elements=input.nextInt();
            bst.insert(elements);
        }
        if(bstCheck(root,null,null)==true)
            System.out.println("YES ");
        else
            System.out.println("NO");
    }
}