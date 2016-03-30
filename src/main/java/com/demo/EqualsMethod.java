package com.demo;

/**
 * Created by xb on 2016/3/30.
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Integer a = new Integer(4);
        Integer b = new Integer(4);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a.equals(b));
    }
}
