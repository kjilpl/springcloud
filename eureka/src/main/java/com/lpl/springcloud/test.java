package com.lpl.springcloud;

public class test {
    public static void main(String[] args) {
        String amt="123";
        System.out.println(amt.indexOf("."));
        System.out.println(amt.length());
        String str1 = "123400";
        StringBuilder sb = new StringBuilder(str1);//构造一个StringBuilder对象
        sb.insert(sb.length()-2, ".");//在指定的位置1，插入指定的字符串
        str1 = sb.toString();
        System.out.println(Double.valueOf(str1.toString()));
    }
}
