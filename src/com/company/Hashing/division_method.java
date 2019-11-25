package com.company.Hashing;

import java.util.Scanner;

public class division_method {

     public static int prime_relative(int loc)
     {
        int m=1;
        int count;
        for(int i=loc;i>0;i--)
        {
            count=0;
            int n=i;
            for(int j=1;j<=i;j++)
            {
                if(n%j==0)
                    count++;
            }
            if(count==2)
            {
                m=n;
                break;
            }
        }
        return m;
     }
    public static int[] find(int e,int loc,int[] given)
    {






        return given;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n= sc.nextInt();
        int given[]=new int[n];
        System.out.println("enter " +n+ " numbers");
        for(int i=0;i<n;i++)
        {
         given[i]=sc.nextInt();
        }
        System.out.println("enter no. of locations");
        int loc=sc.nextInt();
        int a[]=new int[loc];
        int m=prime_relative(loc);
        System.out.println("prime-relative factor="+m);
        for(int i=0;i<n;i++)
        {
            given=find(a[i],loc,given);
        }
        for(int i=0;i<loc;i++)
        {
            if(a[i]!=0)
            System.out.println(a[i]+" possition "+i);
        }
    }
}
