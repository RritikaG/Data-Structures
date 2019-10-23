package com.company.BinarySearchTree;

public class check {
    node root;
    int size;
    int[] a;
    int i=0;
    check(int s)
    {
        this.size=s;
        a=new int[size];
    }
    class node
    {
        int data;
        node left;
        node right;

        node(int d)
        {
            left=right=null;
            data=d;
        }
    }
    public void insert(int data)
    {
        root=insertrec(root,data);
    }
    public  node insertrec(node root,int data)
    {

        if(root==null)
        {
            root=new node(data);
            return root;
        }
        else if(data > root.data)
        {
            root.right = insertrec(root.right,data);
        }
        else if(data< root.data)
        {
            root.left =insertrec(root.left,data);
        }
        return root;
    }
    public void inorder()
    {
        printinorder(root);
    }
    void putelement(int e)
    {
        a[i]=e;
        i++;
    }
    public void printinorder(node root)
    {
        if(root!=null)
        {
            putelement(root.data);
            printinorder(root.left);

            printinorder(root.right);
        }
    }
    public boolean checkinorder(int[] c)
    {

        for(int i=0;i<size;i++)
        {
            if(a[i]!=c[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        check tree = new check(10);
        int preorder[] = {11,6,4,5,8,10,19,17,43,49};
        tree.insert(11);
        tree.insert(6);
        tree.insert(8);
        tree.insert(19);
        tree.insert(4);
        tree.insert(10);
        tree.insert(5);
        tree.insert(17);
        tree.insert(43);
        tree.insert(49);

        tree.printinorder(tree.root);
        if(tree.checkinorder(preorder))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
