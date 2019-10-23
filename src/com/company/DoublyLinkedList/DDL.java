package com.company.DoublyLinkedList;

import java.util.Scanner;

public class DDL {
    Node head,tail;
    class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int d)
        {
            this.data=d;
            next=null;
            prev=null;
        }

    }
    public  void insert_last(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else
        {
            new_node.prev=tail;
            new_node.next=null;
            tail.next=new_node;
            tail=tail.next;
        }
    }
    public void insert_beg(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
            head.prev=new_node;
            new_node.prev=null;
        }

    }
    public void deletef()
    {

        if(head==null)
        {
            System.out.println("Can't delete");
        }
        else
        {
            head.prev=null;
            head=head.next;
        }
    }
    public void deletel()
    {
        if(tail==null)
        {
            System.out.println("can't delete");
        }
        else
        {
            tail.next=null;
            tail=tail.prev;

        }
    }
    public void printf()
    {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
    }
    public static void main(String[] args)
    {
        DDL d1=new DDL();
        DDL d2=new DDL();
        System.out.println("enter number of nodes");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            d1.insert_last(sc.nextInt());
        }
        d1.printf();
        System.out.println();
        d1.deletef();
        d1.deletel();
        d1.printf();
        System.out.println("*******************");
        for(int i=0;i<n;i++)
        {
            d2.insert_beg(sc.nextInt());
        }
        d2.printf();
        System.out.println();
        d2.deletef();
        d2.deletel();
        d2.printf();
    }
}

