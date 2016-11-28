package com.example;


/**
 * 作用：二分法查找
 * 时间：2016/1128
 */
public class Erfenfa {

    public void sort(int arr[],int low,int high) {
        int l=low;
        int h=high;
        int povit=arr[low];

        while(l<h)
        {
            while(l<h&&arr[h]>=povit)
            h--;
            if(l<h){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                l++;
                }

            while(l<h&&arr[l]<=povit)
            l++;

            if(l<h){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                h--;
                }
            }
        System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
        if(l>low)sort(arr,low,l-1);
        if(h<high)sort(arr,l+1,high);
        }

    public static int search(int[] nums, int num) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            //与中间值比较确定在左边还是右边区间,以调整区域
            if (num > nums[mid]) {
                low = mid + 1;
            } else if (num < nums[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        //定义数组
        int[] nums = { 1,2,3,4,5,9,6,8,7,52,23};
        //对数组进行排序
        Erfenfa QuickSort = new Erfenfa();
        QuickSort.sort(nums, 0, nums.length-1);
        //返回下标
        int find = QuickSort.search(nums,23);

        if (find != -1) {
            //输出下标
            System.out.println( find);
        } else {
            System.out.println("找不到数值");
        }


    }

}
