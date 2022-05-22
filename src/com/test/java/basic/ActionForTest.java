package com.test.java.basic;
/*
    随机产生一个数字，用户输入一个数字，判定两个数字的大小 告知用户结果

    java提供了对应的产生随机数的方式以及获取用户输入的方法
    1：获取用户输入的值
        a：在类的声明之前package之后 编写如下代码：import java.util.Scanner;
        b:创建使用Scanner对象 Scanner input = new Scanner(System.in);
        c:通过使用变量获取输入的值 int num = intput.nextInt();

    2：产生随机数
        a:Math.random(); 随机小数[0,1)
 */
import java.util.Scanner;
public class ActionForTest {
    public static void main(String[] args) {
       //获取用户输入的值
        Scanner input;
        input = new Scanner(System.in);

        int num;
        num = input.nextInt();

        System.out.println(num);

        //产生一个数字
        System.out.println(Math.random()*10);

        //指定的[1，10]
        int n = (int)(Math.random()*10+1);
        System.out.println(n);

        //指定的[4，10]
        n = (int)(Math.random()*7+4);
        System.out.println(n);


    }
}
