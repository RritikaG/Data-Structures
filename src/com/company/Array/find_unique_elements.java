package com.company.Array;

import java.util.Scanner;

public class find_unique_elements {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] a=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=1;
        for(int i=0;i<s;i++)
        {
            count=1;
            for(int j=0;j<s;j++)
            {
                if(a[i]==a[j]&& i!=j)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
