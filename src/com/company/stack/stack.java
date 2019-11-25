package com.company.stack;

import java.util.Scanner;

public class stack {
    int top=-1;
    int[] a=new int[10];
    int size=5;
    void push(int e)
    {

        if(top>=size-1)
        {
            System.out.print("Stack overflow, can't add more elements");
        }
        else
        {
            a[++top]=e;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("stack is already empty");
            return 0;
        }
        else
        {
            int  p=a[top--];
             return p;
        }
    }
    boolean isEmpty()
    {
        if(top<0)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args)
    {
        stack s1= new stack();
        Scanner sc= new Scanner(System.in);
      //  int n=sc.nextInt();
        s1.push(10);
        s1.push(20);
        s1.pop();
        s1.push(15);
        s1.push(20);
        s1.push(25);
        s1.push(100);
        s1.push(100);
        System.out.println("elements in stack are");
        while(!s1.isEmpty())
        {
            System.out.println(s1.pop());
        }
    }
}
