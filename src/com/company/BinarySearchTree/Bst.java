package com.company.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

class Bst {
    node root;
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
   public void preorder()
    {
        printpreorder(root);
    }
    public void printpreorder(node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            printpreorder(root.left);
            printpreorder(root.right);
        }
    }
    public int findheight(node root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            int lh=findheight(root.left);
            int rh=findheight(root.right);
            if(lh>rh)
            {
                return lh+1;
            }
            else
            {
                return rh+1;
            }
        }
  }
    public int findMax(node root)
    {
        if(root == null)
        {
            return -1;
        }
        else
        {
            int res=root.data;
            int lres=findMax(root.left);
            int rres=findMax(root.right);
            if(lres>res)
                res=lres;
            if(rres>res)
                res=rres;
            return res;
        }
    }
public int findmin(node root) {
    if (root == null)
        return Integer.MAX_VALUE;
    else {
        int res = root.data;
        int leftres = findmin(root.left);
        int rightres = findmin(root.right);
        if (leftres < res)
            res = leftres;
        if (rightres < res)
            res = rightres;
        return res;
    }
}
    void printLevelOrder()
    {
        int h = findheight(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
    void printGivenLevel(node root,int level)
    {
     if(root==null)
     {
         return;
     }
     if(level==1)
     {
         System.out.print(root.data+ " ");
     }
    else if(level > 1)
     {
         printGivenLevel(root.left,level-1);
         printGivenLevel(root.right,level-1);
     }
    }

    public static void main(String[] args)
 {
     Bst tree=new Bst();
     Bst tree2=new Bst();
     tree.insert(11);
     tree.insert(6);
     tree.insert(8);
     tree.insert(19);
     tree.insert(4);
     tree.insert(100);
   //  tree.insert(5);
     tree.insert(17);
     tree.insert(43);
    tree.insert(49);
   //  tree.insert(31);
     tree.preorder();
     int level=tree.findheight(tree.root);
     System.out.println("\n max elementis="+tree.findMax(tree.root));
     System.out.println("min elment is="+ tree.findmin(tree.root));
     tree2.insert(11);
     tree2.insert(6);
     tree2.insert(8);
     tree2.insert(19);
     tree2.insert(4);
     tree2.insert(100);
     tree2.insert(5);
     tree2.insert(17);
     tree2.insert(43);
     tree2.insert(49);
     tree2.insert(31);
     tree2.printLevelOrder();
 }
}
