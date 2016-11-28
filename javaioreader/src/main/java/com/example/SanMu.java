package com.example;

import java.util.Scanner;

/**
 * 作用：三目运算符
 * 时间：2016/1128
 */
public class SanMu {
    public int max(int a,int b){
        return  a>b?a:b;//条件?true:false
    }
    public static void main(String[] args) {
        //在控制台输入数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        //输入两位数字
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        SanMu demo = new SanMu();
        int max = demo.max(a,b);
        System.out.print(max);
    }
}
