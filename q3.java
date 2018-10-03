package q3_merge;

import java.util.*;
class q3_merging_2_linklist {
  public static void main(String[] args) {
    linklist l=new linklist();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size : ");
    int size=sc.nextInt();
    node1 head1=null;
    node2 head2=null;
    int i=0;
    for(i=1;i<=size;i++)
    {
      head1=l.insert1(head1,i);
    }
    for(i=1;i<=size;i++)
    {
      head2=l.insert2(head2,i*10);
    }
    System.out.print("Linklist 1st : ");
    l.display1(head1);
    System.out.print("\n\nLinklist 2nd : ");
    l.display2(head2);
    System.out.println("\nLinklist afer merging : ");
    l.merge(head1,head2);
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
class node2
{
  int data2;
  node2 next2;
  node2(int data2)
  {
    this.data2=data2;
  }
}
class linklist
{
  public node1 insert1(node1 head1,int d)
  {
    node1 temp1=new node1(d);
    if(head1==null)
    {
      head1=temp1;
    }
    else
    {
      node1 temp2=head1;
      while(temp2.next1!=null)
      {
        temp2=temp2.next1;
      }
      temp2.next1=temp1;
    }
    return head1;
  }
  
  public node2 insert2(node2 head2,int d)
  {
    node2 t1=new node2(d);
    if(head2==null)
    {
      head2=t1;
    }
    else
    {
      node2 t2=head2;
      while(t2.next2!=null)
      {
        t2=t2.next2;
      }
      t2.next2=t1;
    }
    return head2;
  }

  public void display1(node1 head1)
  {
    node1 te1=head1;
    while(te1!=null)
    {
      System.out.print(te1.data1+" ");
      te1=te1.next1;
    }
  }
  public void display2(node2 head2)
  {
    node2 te2=head2;
    while(te2!=null)
    {
      System.out.print(te2.data2+" ");
      te2=te2.next2;
    }
  }
 
  public void merge(node1 head1,node2 head2)
  {
    node1 tea1=head1;
    while(tea1.next1!=null)
    {
      tea1=tea1.next1;
    }
    node2 tea2=head2;
    while(tea2!=null)
    {
      node1 dup=new node1(tea2.data2);
      tea1=head1;
      while(tea1.next1!=null)
      {
        tea1=tea1.next1;
      }
      tea1.next1=dup;
      tea2=tea2.next2;
    }
    tea1.next1=null;
    
    node1 tep1=head1;
    while(tep1!=null)
    {
      System.out.print(tep1.data1+" ");
      tep1=tep1.next1;
    }

  }


}
