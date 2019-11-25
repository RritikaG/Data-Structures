package com.company.Array;

import java.util.Scanner;

public class segregate0_1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] a=new int[s];
        int[] t=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        int j=0;
        int k=t.length-1;
        for(int i=0;i<s;i++)
        {
            if(a[i]==0) {
                t[j] = a[i];
                j++;
            }

            else {
                t[k] = a[i];
                k--;

            }        }
        for(int i=0;i<s;i++)
        {
            System.out.print(t[i]+" ");
        }
    }
}
