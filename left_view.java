class node{
    int data;
    node left,right;
    node (int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class left_view {
    static node root;
    left_view()
    {
        root=null;
    }
    static int k=0;
    static void print(node root,int i)
    {
        if(root==null)
        {
            return;
        }
        if(k<i)
        {
            System.out.println(root.data+" ");
            k=i;
        }
        print(root.left,i+1);
        print(root.right,i+1);
    }
    public static void main(String args[])
    {
        
		root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		print(root,1);
    }
}
