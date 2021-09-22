package com.company.problems1;

import java.util.Scanner;

public class TwistedPrimeNumber {
    int isTwistedPrime(int N) {
        int number=0;
        int output=0;
        while(N>0){
            int rem=N%10;
            number=number*10+rem;
            N=N/10;
        }
        if(number<=1){
            return output;
        }
        else if(number==2){
            output=1;
            return output;
        }
        else if(number%2==0){
            return output;
        }
        else{
            for(int i=3;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    return output;
                }
            }
        }
        output=1;
        return output;
    }
    public void checkPrime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        int output=isTwistedPrime(number);
        System.out.println("twisted prime number:"+output);
    }
}
