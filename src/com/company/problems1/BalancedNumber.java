package com.company.problems1;

import java.util.Scanner;

public class BalancedNumber {
    public Boolean balancedNumber(String N)
    {
        int len=N.length();
        boolean val=false;
        int sum1=0,sum2=0;
        for(int i=0;i<len;i++){
            if(i<(len/2)){
                sum1+=(N.charAt(i)-48);
            }
            else if(i>(len/2)){
                sum2+=(N.charAt(i)-48);
            }
        }
        if(sum1==sum2){
            val=true;
        }
        return val;
    }
    public void checkBalance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        if(balancedNumber(str)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
