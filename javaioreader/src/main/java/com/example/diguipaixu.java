package com.example;

/**
 * 作用：递归排序
 * 时间：2016/1128
 */
public class diguipaixu {
    //排序
    public void sortArray(int[] array,int m,int n)
    {
        if(m>0)
        {
            if(array[n]<array[n-1])
            {
                swap(array,n);
            }

            if(n>=m)
            {
                sortArray(array,m-1,1);
            }
            else
            {
                sortArray(array,m,n+1);
            }
        }
    }

    void swap(int[] array,int k)
    {
        int temp = array[k];
        array[k] = array[k-1];
        array[k-1]= temp;
    }

    public void showArray(int[]array)
    {
        for(int i = 0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args)
    {
        diguipaixu demo = new diguipaixu();
        int[] a = new int[]{3,5,1,2,8,33,22,11,0};

        demo.sortArray(a,a.length-1,1);
        demo.showArray(a);
    }
}
