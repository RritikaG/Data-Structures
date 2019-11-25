package com.company.Array;

import java.util.HashSet;
import java.util.Set;

public class intersection_2_unsorted {
    public static void main(String[] args) {
        int[] a = {1, 3,5,6,4,5,6,89,0};
        int[] b = {2, 3, 4, 5, 5, 6,2,1,3,4,5,89,7,45,56,0};
        Set<Integer> temp=new HashSet<>();
        Set<Integer> fnl=new HashSet<>();
        int i=0,j=0;
        while(i<a.length)
        {
            temp.add(a[i]);
            i++;
        }
        while(j<b.length)
        {
            if(temp.contains(b[j]))
            {
                fnl.add(b[j]);
            }
            j++;
        }
        System.out.println(fnl);
    }
}
