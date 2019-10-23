package com.company.Sorting;

public class HeapSort
{

    public static void main(String[] args)
    {
        int[] a = {12,23,43,44,5,56,67,87,90};
        HeapSort hs=new HeapSort();
        hs.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public void sort(int[] a)
    {
        int len=a.length;
        for(int i=len/2-1;i>=0;i--)
        {
            heapify(a,len,i);
        }
        for(int i=len-1;i>=0;i--)
        {
            int t=a[0];
            a[0]=a[i];
            a[i]=t;
            heapify(a,i,0);
        }
    }
    void heapify(int[] a,int len,int i)
    {
        int largest=i;
        int lefti=2*i+1;
        int righti=2*i+2;
        if(lefti < len && a[lefti] > a[largest]) //   < a[lar] for descending order
        {
            largest=lefti;
        }
        if(righti < len && a[righti] > a[largest])
        {
            largest=righti;
        }
        if(largest!=i)
        {
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;
            heapify(a,len,largest);
        }
    }

}
