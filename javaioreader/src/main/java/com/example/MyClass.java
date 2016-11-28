package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * autour: 孟向阳
 * date: 2016/11/28 15:58
 * update: 2016/11/28
 */

public class MyClass {
    /**
     * ���ֽ�Ϊ��λ��ȡ�ļ��������ڶ��������ļ�����ͼƬ��������Ӱ����ļ���
     *
     * @param fileName �ļ�����
     */
    public static void readFileByBytes(String fileName) {
        File file = new File(fileName);
        InputStream in = null;

        try {
            System.out.println("���ֽ�Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���ֽڣ�");
            // һ�ζ�һ���ֽ�
            in = new FileInputStream(file);
            int tempbyte;
            while((tempbyte=in.read()) != -1){
                System.out.write(tempbyte);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    public static void main(String[] args) {
        MyClass file = new MyClass();
        file.readFileByBytes("F:/music/�½��ı��ĵ�.txt");


    }

}
