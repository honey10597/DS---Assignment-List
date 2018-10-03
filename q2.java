package q2_remove_dup;

import java.util.*;
class q2_remove_duplicates {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    linklist l=new linklist();
    node head=null;
    System.out.print("enter size\n");
    int size=sc.nextInt();
    for(int i=1;i<=size;i++)
    {
      // int f=sc.nextI t();
      head=l.insert(head,sc.nextInt());
    }
    l.remove(head);
    l.display(head);

  }
}
class node
{
  int data;
  node next;
  node(int data)
  {
    this.data=data;
  }
}
class linklist
{
  public node insert(node head,int d)
	{
		node temp=new node(d);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			node temp1=head;
			while(temp1.next!=null)
			{
				temp1=temp1.next;
			}
			temp1.next=temp;
      
		}
		return head;
	}

  public void remove(node head)
  {
    node tr=head;
    while(tr.next!=null)
    {
      node to=tr.next;
      while(to.next!=null)
      {
        if(tr.data==to.data)
        {
          tr.next=to.next;
        }
        to=to.next;
      }
      tr=tr.next;
    }
  }

  public void display(node head)
  {
    node td=head;
    while(td!=null)
    {
      System.out.print(td.data+" ");
      td=td.next;
    }
  }

}
