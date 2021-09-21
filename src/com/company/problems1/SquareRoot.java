package com.company.problems1;

import java.util.Scanner;

public class SquareRoot {
    public long find(long x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long i = 1, res = 1;
        while (res <= x) {
            i++;
            res = i * i;
        }
        return i - 1;
    }
    public void findSquareRoot(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        long num=sc.nextLong();
        long sqrt=find(num);
        System.out.println("square root is:"+sqrt);
    }
}
