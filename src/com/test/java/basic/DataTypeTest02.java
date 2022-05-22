package com.test.java.basic;

//测试使用JAVA的数据类型
public class DataTypeTest02 {
    public static void main(String[] args) {
        double d =3.15; //8个字节 存储的精度 15-16位
        System.out.println(d);//java中的小数不建议直接使用 所有计算机中都存在小数的精度问题

        double f = 3.14;
        System.out.println(d-f);
        System.out.println(0.6-0.5);
        float g = 3.14F;

        boolean flag=true;
        System.out.println(flag);

        flag=false;
        System.out.println(flag);

        if (d>f){
            System.out.println("d>f");
        }

        System.out.println(1.5-1.2);
        System.out.println(5>4);
        System.out.println(5<4);

        System.out.println("逻辑运算符^"); //同性相斥 异性相吸
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("逻辑运算符||"); //短路或，效率高
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("逻辑运算符&&"); //短路与，效率高
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
