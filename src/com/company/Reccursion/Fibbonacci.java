package com.company.Reccursion;

import javax.swing.*;
import java.util.Scanner;
public class Fibbonacci {

    static int n1=0,n2=1,n3=0;
    public  static void fib(int n) {
    if(n>0)
    {
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.println(n3);
        fib(n-1);
    }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("0 \n1 ");
        fib(n-2);
    }
}
