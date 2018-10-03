 package q6_even_odd_merging_linklist;

import java.util.Scanner;

public class q6_even_odd_merge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int i=0;
	    node1 head1=null;
	    linklist l=new linklist();
	     System.out.println("enter size of linklist");
	     int size=sc.nextInt();
	      System.out.println("enter elements");
	    for(i=1;i<=size;i++)
	    {
	      int hu=sc.nextInt();
	      l.insert(hu);
	    }
	    head1=l.put(head1);
	    l.display(head1);
	}
	

}

class node
{
    int data;
    node next;
    node(int d)
    {
    	data=d;
    }
}

class node1
{
	int data1;
	node1 next1;
	node1(int data1)
	{
		this.data1=data1;
	}
}

class linklist
{
    
    node head;
    public void insert(int d)
    {
        node temp=new node(d);
        node temp2=head;
        if(head==null)
        {
           head=temp;
        }
        else
        {
            while(temp2.next!=null)
            {
                temp2=temp2.next;
            }
            temp2.next=temp;
        }
    }
    public node1 put(node1 head1)
    {
    	node temp3=head;
    	while(temp3!=null)
    	{
    		if((temp3.data)%2!=0)
    		{
    			node1 t1=new node1(temp3.data);
    			if(head1==null)
    			{
    				head1=t1;
    			}
    			else
    			{
    				node1 t2=head1;
    				while(t2.next1!=null)
    				{
    					t2=t2.next1;
    				}
    				t2.next1=t1;
    			}
    		}
        temp3=temp3.next;
    	}
    	
    	temp3=head;
    	while(temp3!=null)
    	{
    		if((temp3.data)%2==0)
    		{
    			node1 t5=new node1(temp3.data);
    			if(head1==null)
    			{
    				head1=t5;
    			}
    			else
    			{
    				node1 t6=head1;
    				while(t6.next1!=null)
    				{
    					t6=t6.next1;
    				}
    				t6.next1=t5;
    			}
    		}
        temp3=temp3.next;
    	}
    	return head1;
    }
    public void display(node1 head1)
    {
    	node1 tx=head1;
    	while(tx!=null)
    	{
    		System.out.print(tx.data1+" ");
    		tx=tx.next1;
    	}
    }
}
