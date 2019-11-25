package com.company.stack;

import java.awt.*;
import java.util.Scanner;

public class reverse_string {
    int top=-1;
    char[] a;
    int size;
    reverse_string(int s)
    {
        size=s;
        a=new char[size];
    }
    void push(char e)
    {
        if(top>=size-1)
        {
            System.out.println("stack overflow");
            return;
        }
        else {

            a[++top]=e;
        }
    }
    char pop()
    {
        if(top<0)
        {
            System.out.println("underflow");
            return '\0';
        }
        else {
            char  p=a[top--];
            return p;
        }
    }
    boolean isEmpty()
    {
        if(top==-1)
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
       System.out.println("enter size of string");
       Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
       reverse_string s1=new reverse_string(s);
       while(s>0)
       {
           char a=sc.next().charAt(0);
           s1.push(a);
           s--;
       }
       String name=new String();
       while(!s1.isEmpty())
       {
           name=name+s1.pop();
       }
       System.out.println("reversed string is "+name);
   }

}
