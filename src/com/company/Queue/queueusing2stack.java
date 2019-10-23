package com.company.Queue;

import java.util.Scanner;
import java.util.Stack;

public class queueusing2stack {

   static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();

    void enque(int item)
    {
        st1.push(item);
    }
    int deque()
    {
        if(st2.isEmpty())
        {
            while(!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            return st2.pop();
        }
        return st2.pop();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        queueusing2stack queue =new queueusing2stack();
        queue.enque(1);
        queue.enque(3);
        queue.enque(4);
        System.out.println(queue.deque());
        queue.enque(5);
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());

    }


}
