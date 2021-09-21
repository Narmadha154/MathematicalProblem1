package com.company.problems1;

import java.util.Scanner;

public class PerfectNumber {
   public static int isPerfectNumber(Long N) {
        long sum=0;
        int output=0;
        for(int i=1;i<N;i++){
            if(N%i==0){
                sum+=i;
            }
        }
        if(sum==N){
            output=1;
        }
        return output;
    }
   public static void checkPrfNum(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       long number=sc.nextLong();
       int output=isPerfectNumber(number);
       System.out.println("perfect number:"+output);
   }
}
