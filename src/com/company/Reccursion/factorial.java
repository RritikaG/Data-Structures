package com.company.Reccursion;

public class factorial {
    public static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args)
    {
        int factorial = fact(4);
        System.out.println(factorial);
    }
}
