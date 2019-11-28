import java.util.*;
public class lowest_ancestor {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static Node root;
    Node lowest (Node root,int a, int b){
    if(root==null){
        return root;
    }
    if(root.data==a|| root.data==b)
    {
        return root;
    }
    Node l=lowest(root.left,a,b);
    Node r=lowest(root.right,a,b);
        return(l!=null)?l:r;
}
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        lowest_ancestor la= new lowest_ancestor();
        la.root= new Node(10);
        la.root.left= new Node(20);
            la.root.right= new Node(30);
                la.root.left.left= new Node(40);
          la.root.left.right= new Node(50);    
          la.root.right.left= new Node(60);
               la.root.right.right= new Node(70);
               System.out.println("Enter 2 nodes");
               int a=sc.nextInt();
               int b=sc.nextInt();
               Node l=la.lowest(la.root, a, b);
               System.out.print("lowest common  ancestor : "+l.data);
    }
}
