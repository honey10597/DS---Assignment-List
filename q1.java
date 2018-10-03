package q1_swap_ele;

import java.util.Scanner;
public class q1_swap_2_element_linklist {
	public static void main(String[] args) {
		linklist l=new linklist();
		Scanner sc=new Scanner(System.in);
		node head=null;
		int i=0;
		System.out.println("enter size");
		int size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			head=l.insert(head,i);
		}
		
    System.out.println("\nenter a 2 pos");
    int pos=sc.nextInt();
    int pos1=sc.nextInt();
    l.swap(head,pos,pos1);
    // l.dis(head);
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

  public void swap(node head,int pos,int pos1)
  {
    int t=0;
    node first=null,second=null;
    int k=1;
    if(pos==1)
    {
      first=head;
      System.out.println("\nelement at pos"+k+" is : "+first.data);
    }

      node tc=head;
      tc=tc.next;
      while(tc!=null)
      {
          k++;
        if(k==pos)
        {
          first=tc;
          System.out.print("element at pos1 "+k+" is :"+first.data+" \n");
        }
        if(k==pos1)
        {
          second=tc;
          System.out.print("element at pos2 "+k+" is :"+second.data+" \n");

          // swapping
          t=first.data;
          first.data=second.data;
          second.data=t;
        }
        tc=tc.next;
      }
     
    }

	public void display(node head)
	{
		node t1=head;
		while(t1!=null)
		{
			System.out.print(t1.data+" ");
			t1=t1.next;
		}
	}
  
}