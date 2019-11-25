package com.company.Array;

import java.util.Scanner;

public class segregate_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int od=0;
        int ev=0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            int e=sc.nextInt();
            if(e%2==0)
                ev++;
            else
                od++;
            a[i]=e;
        }
        int[] t=new int[n];
        int k=0;
        int y=ev;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                t[k]=a[i];
                k++;
            }
            else {
                t[y]=a[i];
                y++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("--"+t[i]+"--");
        }


    }
}
