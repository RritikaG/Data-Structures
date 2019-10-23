package com.company.LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class Linklist {
    
    Node head;
    class Node{
        Node next;
        int data;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
        
    }
    void insertNode(int d) {
        Node new_node = new Node(d);

        if(head==null)
        {
            head=new_node;
        }
        else{
            Node ptr=head;
            while(ptr.next!=null) {
                ptr = ptr.next;
            }
            ptr.next=new_node;
        }
    }
    void printlist(){
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
        ptr=ptr.next;
        }

    }
    void checkpalindrome() {
        Stack<Integer> st= new Stack();
        Node ptr=head;
        while (ptr!=null)
        {
            st.push(ptr.data);
            ptr=ptr.next;
        }
        Node ptr1=head;
        int flag=0;
        while(ptr1!=null)
        {
            flag=0;
            if(st.pop()!=ptr1.data)
            {
                flag=1;
                break;

            }
            else {
                ptr1=ptr1.next;
            }

        }
        if(flag==1)
        {
            System.out.println("not palindrome");
        }
        else {
            System.out.println(" palindrome");
        }
    }

    public static void main(String[] args)
    {
System.out.println("enter the number of nodes you want to enter");
int n;
Linklist list= new Linklist();
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
    list.insertNode(sc.nextInt());
}
list.printlist();

list.checkpalindrome();
        

    }



}
