package com.example;

import java.util.Scanner;

/**
 * 作用：住房公积金的运算
 * 时间：2016/1128
 */
public class fangjijin {
    public double jisuan(double num) {
        if (num > 1000) {
            num = num * 0.1*2.0;
        }
        return num;
    }

    public static void main(String[] args) {
        fangjijin fangjijin = new fangjijin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字...");
        double sum = scanner.nextDouble();
        double jieguo = fangjijin.jisuan(sum);
        System.out.print(jieguo);
    }
}
