package com.company.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackusingqueue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    static int size;
    void push(int item)
    {
        q2.add(item);
        size++;

        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }
            Queue<Integer> q;
        q=q1;
        q1=q2;
        q2=q;
    }
    int top()
    {
        if(q1.isEmpty())
            return -1;
        return q1.peek();
    }
    void pop()
    {
        if(q1.isEmpty())
            return;
        q1.remove();
        size--;

    }

    public static void main(String[] args)
    {
        stackusingqueue stack =new stackusingqueue();
        stack.push(1);
        stack.push(4);
        stack.pop();
        System.out.println(stack.top());
        stack.push(10);
        stack.push(41);
        stack.push(11);
        stack.push(40);
        System.out.println(stack.top());
        System.out.println(size);
    }
}
