package com.company.Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements to be inserted=");
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements=");
        for (int in = 0; in < n; in++) {
            a[in] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
         int  temp = a[i];
          int  j = i - 1;
            while (j >= 0 && a[j]>temp) { // temp > a[j] for desc
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(a[k]+ " ");
        }
    }
}
