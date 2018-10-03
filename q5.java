package q5_reverse;

import java.util.*;
public class q5_rever {

    public static void main(String xxx[])
    {
        linklist l=new linklist();
        int i=0;
        for(i=1;i<=5;i++)
        {
            l.insert(i*10);
        }
        l.rev();
        l.display();
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
  
    public void rev() //   reverse of linklist
    {
    	node prev=null;
    	node current=head;
    	node tempre=null;
    	while(current!=null)
    	{
    		tempre=current.next;
    		current.next=prev;
    		prev=current;
    		current=tempre;
    	}
    	head=prev;
    }
    
  
    public void display()
    {
        node tempr=head;
        while(tempr!=null)
        {
            System.out.print(tempr.data+" ");
            tempr=tempr.next;
        }
    }
}

	
