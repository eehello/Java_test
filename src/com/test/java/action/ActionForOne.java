package com.test.java.action;

import java.util.Scanner;

public class ActionForOne {
    public static void main(String[] args) {
        //产生一个数字[33-44]
        int num = (int)(Math.random()*12+33);

        //给用户提示
        System.out.println("请输入一个33-44之间的数字>>>");
        Scanner input = new Scanner(System.in);
        //获取用户输入
        int inputnum = input.nextInt();

        //比较输入数字和系统产生的数字
        String tips = inputnum==num?"你好棒啊！一次就猜对了！":"你好逊啊，猜错了，要加油哟！";
        //输出结果
        System.out.println("你输入的数字是：" + inputnum + ", 系统产生的数字是：" + num + ", " + tips);
    }
}
