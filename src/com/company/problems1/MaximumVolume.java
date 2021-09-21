package com.company.problems1;

import java.util.Scanner;

public class MaximumVolume {
    public static void findMaxVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value:");
        long a=sc.nextLong();
        System.out.println("Enter the b value:");
        long b=sc.nextLong();
        /*long l=(long)(a-Math.sqrt(a*a-24*b))/12;
        long v=(long)(l*(b/2-l*(a/4-l)));
       // long v =(long) (36*a*b - a*a*a +(Math.sqrt((a*a- 24*b)*(a*a- 24*b)*(a*a- 24*b))))/(12*72);
        System.out.println("volume is:"+v);*/
        double p=(double)a;
        double s=(double)b;
        double v =(36*p*s - Math.pow(p,3) +(Math.sqrt(Math.pow((p*p- 24*s),3))))/(12*72);
        long ans=(long)v;
        if(ans<0){
            ans=0;
        }
        System.out.println("Maximum volume is:"+ans);
    }
}
