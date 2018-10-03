package q4_palndrme;

import java.util.*;
class q4_palindrome {
  public static void main(String[] args) {
    linklist l=new linklist();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
    int i=0;
    System.out.println("\nenter numbers");
    for(i=1;i<=size;i++)
    {
      l.insert(sc.nextInt());
    }
    newnode hea=null;
    l.prog();
    l.display(hea);
   
    // System.out.print(b);
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
class newnode
{
  int d;
  newnode nex;
  newnode(int d)
  {
    this.d=d;
  }
}
class linklist
{
  node head;
  public void insert(int d)
  {
    node temp=new node(d);
    if(head==null){
      head=temp;
    }
    else{
      node t=head;
      while(t.next!=null)
      {
        t=t.next;
      }
      t.next=temp;
    }
  }
  public void prog()
  {
    node current=head;
    node prev=null;
    node tempr=null;
    while(current!=null)
    {
      tempr=current.next;
      current.next=prev;
      prev=current;
      current=tempr;
    }
    head=prev;
  }
  public void display(newnode hea)
  {
    node tem=head;
    while(tem!=null)
    {
      newnode nt=new newnode(tem.data);
      if(hea==null)
      {
        hea=nt;
      }
      else
      {
        newnode tr=hea;
        while(tr.nex!=null)
        {
          tr=tr.nex;
        }
        tr.nex=nt;
      }
      tem=tem.next;
    }


     node c=head;
     node p=null;
     node temper=null;
     while(c!=null)
     {
       temper=c.next;
       c.next=p;
       p=c;
       c=temper;
     }
     head=p;


      int fl=1;
     newnode h1=hea;
     node  g1=head;
     while(h1!=null || g1!=null)
     {
       fl=1;
       if(h1.d!=g1.data)
       {
         fl=0;
         break;
       }
       h1=h1.nex;
       g1=g1.next;
     }
     
     if(fl==1)
     {
       System.out.println("\nLinklist is Palindrome");
     }
     else
     {
       System.out.println("\nNot Palindrome");
     }

  }
 
}
