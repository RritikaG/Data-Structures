package com.company.Sorting;

import java.util.Scanner;

public class MergeSort {

    public static void divide(int[] A, int lb,int ub)
    {
        int mid=(lb+ub)/2;
        divide(A,lb,mid);
        divide(A,mid+1,ub);
        merge(A,lb,mid,ub);
    }
    public static void merge(int[] a,int lb, int mid, int ub)
    {
        int i=lb;
        int j=mid+1;
        int k=lb;
        int n=ub;
        int[] b=new int[n];
        while(i<=mid && j<=ub)
        {
            if(a[i]<=a[j])
            {
                b[k]=a[i];
                k++;
                i++;
            }
            else
            {
                b[k]=a[j];
                k++;
                j++;
            }
        }
        if(i>mid)
        {
            while(j<=ub) {
                b[k] = a[j];
                k++;
                j++;
            }
        }
        else
            {
            while (i <= mid) {
                b[k] = a[i];
                k++;
                j++;
            }
        }
        for(int c=lb;c<=ub;c++)
        {
            a[c]=b[c];
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements to be inserted=");
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements=");
        for (int in = 0; in < n; in++) {
            a[in] = sc.nextInt();
        }
        divide(a,0,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ "->");
        }
    }

}
