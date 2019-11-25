package com.company.stack;

import org.w3c.dom.Node;

public class stackusingLL {
        Node head;
        class Node
        {
            int data;
            Node next;
            Node(int d) {
                data = d;
            }
        }
        void push(int e)
        {
            Node newnode=new Node(e);
            if(head==null)
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        int pop()
        {
            if(head==null)
            {
                System.out.print("stack is already empty");
                return Integer.MIN_VALUE;
            }
            int t=head.data;
            head=head.next;
            return t;
        }
        int top()
        {
            return head.data;
        }
        void show()
        {
            Node ptr=head;
            System.out.println("Stack is=");
            while(ptr!=null)
            {
                System.out.println(ptr.data);
                ptr=ptr.next;
            }
        }

    public static void main(String[] args)
    {
        stackusingLL l1=new stackusingLL();
        l1.push(10);
        l1.push(15);
        l1.push(20);
        l1.pop();
        l1.push(25);
        l1.show();
        System.out.println("top element is"+l1.top());

    }
}
