package com.company.Array;

import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] t=new int[n];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        int s=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                t[s++]=a[i];
            }

        }
        t[s++]=a[n-1];
        for(int i=0;i<s;i++)
        {
            System.out.println("---"+t[i]+"--");
        }

    }
}