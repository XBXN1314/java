package com.demo;

/**
 * Created by xb on 2016/3/30.
 */
public class Test7 {
    public static void main(String[] args) {
        int temp = (int) (Math.random() * 100);
        for (int i = 0; i < 24; i++) {
            int randNumber = (int) (Math.random() * 100);
            if (randNumber > temp)
                System.out.println(temp + "<" + randNumber);
            else if (randNumber == temp)
                System.out.println(temp + "=" + randNumber);
            else
                System.out.println(temp + ">" + randNumber);
            temp = randNumber;
        }
    }
}
