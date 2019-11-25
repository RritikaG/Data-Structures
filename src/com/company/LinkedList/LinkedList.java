package com.company.LinkedList;

public class LinkedList {
    node head;
    class node {
        int data;
        node next;
        node(int d) {
            data = d;
            next=null;
        }
    }
    void append(int data)
    {
        node newnode= new node(data);
        node temp=head;
        if(temp == null)
        {
            head=newnode;
            return;
        }
        newnode.next=null;
        node ptr=head;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=newnode;
    }
    void push(int data)
    {
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }
    void print()
    {
        node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    void insertafter(int d,int newdata)
    {
        node newnode=new node(newdata);
        node ptr=head;
        while(ptr.next!=null)
        {

            if(ptr.data == d)
            {
                newnode.next=ptr.next;
               ptr.next=newnode;
            }
            ptr=ptr.next;
        }
    }
    void deletenode(int d)
    {
      node temp=head,prev=null;
      if(temp==null)
      {
          System.out.println("empty ll");
          return;
      }
      if(temp!=null && temp.data==d)
      {
          head=temp.next;
          return;
      }
      while(temp!=null && temp.data!=d)
      {
          prev=temp;
          temp=temp.next;
      }
      prev.next=temp.next;
    }
    public static void main(String[] args)
    {
        LinkedList l1=new LinkedList();
        l1.append(10);
        l1.append(20);
        l1.push(0);
        l1.append(3);
        l1.append(4);
        l1.insertafter(20,15);
        l1.print();
        System.out.println("\nafter deleting the node ll is->\n");
        l1.deletenode(0);
        l1.print();
    }
}
