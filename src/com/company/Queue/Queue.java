package com.company.Queue;

public class Queue {

    int size;
    int[] a;
    int front=-1,rear=-1;
    Queue(int s)
    {
        size=s;
        a=new int[10];
    }
    public void enqueue(int e)
    {
        if(ISFULL())
        {
            System.out.println("cant add more elements");
            return;
        }
        else if(ISEMPTY())
        {
            front=0;
            rear=0;
        }
        else
        {
            rear++;
        }
        a[rear]=e;

    }
    public void dequeue()
    {
        if(ISEMPTY())
        {
            return;
        }
        else if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
    }
    public void show()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    boolean ISEMPTY()
    {
        if(front==-1 && rear==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean ISFULL()
    {
        if(rear>=size)
        {
            return true;
        }
        else{
            return false;
        }
    }
    int frontelement()
    {
        return a[front];
    }
    int endelement()
    {
        return a[rear];
    }
    public static void main(String[] args)
    {
        Queue q1=new Queue(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.dequeue();
        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(8);
        q1.enqueue(10);
        q1.enqueue(12);
        System.out.println("Elements in queue are");
        q1.show();
        System.out.println("\n"+q1.frontelement()+"   "+q1.endelement());

    }
}
