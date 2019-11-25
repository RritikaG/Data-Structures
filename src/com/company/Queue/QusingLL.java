package com.company.Queue;

import org.w3c.dom.Node;

public class QusingLL {
    node top;
    class node
    {
        int data;
        node next;
        node(int d)
        {
            data=d;
        }
    }
    void enque(int e)
    {
        node newnode=new node(e);
        if(top==null)
        {
            top=newnode;
            return;
        }
        else
        {
            node ptr=top;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
    }
    int deque()
    {

        if(top==null)
        {
            System.out.println("cant delete queue is laready empty");
            return Integer.MIN_VALUE;
        }
        else
        {
            int d=top.data;
            top=top.next;
            return d;
        }
    }
    boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        QusingLL q1=new QusingLL();
        q1.enque(10);
        q1.enque(20);
        System.out.println(q1.deque());
        q1.enque(15);
        q1.enque(20);
        q1.enque(25);
        q1.enque(30);

        while(!q1.isEmpty())
        {
            System.out.println(q1.deque());
        }
    }
}
