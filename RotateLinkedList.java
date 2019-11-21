import java.util.Scanner;
public class RotateLinkedList {
    Node head;
  static  class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
  public static RotateLinkedList insert(RotateLinkedList li,int data)
  {
      Node node= new Node(data);
      node.next=null;
      if(li.head==null)
      {
          li.head=node;
}
      else
      {
          Node last=li.head;
          while(last.next!=null)
          {
              last=last.next;
          }
          last.next=node;
      }
      return li;
  }
   public static RotateLinkedList rotate(RotateLinkedList li,int k)
   {
       while(k!=0)
       {
           Node temp=li.head;
          // Node temp1=li.head;
           while(temp.next.next!=null)
           {
               temp=temp.next;
           }
           temp.next.next=li.head;
           li.head=temp.next;
           temp.next=null;
           k--;
       }
       return li;
   }
   public static void display(RotateLinkedList li)
   {
       Node temp=li.head;
       while(temp!=null)
       {
           System.out.println(temp.data);
           temp=temp.next;
       }
   }
   public static void main(String args[])
   {
       RotateLinkedList li= new RotateLinkedList();
       Scanner input= new Scanner(System.in);
       System.out.println("Size");
    int n=input.nextInt();
    System.out.println("Elements");
    for(int i=0;i<n;i++)
    {
        int data=input.nextInt();
        insert(li,data);
    }
    System.out.println("Number Of Rotations");
    int k=input.nextInt();
    rotate(li,k);
    System.out.println("After Rotations");
    display(li);
   }
}
