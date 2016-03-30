package com.demo;

/**
 * Created by xb on 2016/3/30.
 */
public class WhileTes {
    public static void main(String[] args) {
        double r = 0d;
        while (r < 0.99d) {
            System.out.println(r);
            r = Math.random();
        }
        System.out.println(r);
    }
}
