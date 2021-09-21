package com.company.problems1;

import java.util.Scanner;

public class DoorsOpen {
    public static void noOfOpenDoors() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        long number=sc.nextLong();
        int doorsOpen=(int)Math.sqrt(number);
        System.out.println("no.of doors open:"+doorsOpen);
    }
}
