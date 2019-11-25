package com.company.Array;

import java.util.ArrayList;

public class intersection_2_sorted {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6};
        int[] b = {2, 3, 4, 5,5, 6};
        ArrayList<Integer> f = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            while(i<a.length-1 && a[i]==a[i+1])
            {
                i++;
            }
            while(j<b.length-1 && b[j]==b[j+1])
            {
                j++;
            }
            if(b[j]<a[i])
            {
                j++;
            }
            else if(a[i]<b[j])
            {
                i++;
            }
            else
            {
                f.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println(f);
    }
}
