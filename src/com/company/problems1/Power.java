package com.company.problems1;

import java.util.Scanner;

public class Power {
    static Long isPowerOfAnother(Long X, Long Y){
        long output=0;
        long mul=1;
        if(X==1){
            return output;
        }
        else if(Y==1){
            output=1;
            return output;
        }
        else{
            for(int i=0;i<Y/2;i++){
                mul*=X;
                if(mul==Y){
                    output=1;
                    return output;
                }
            }
        }
        return output;
    }
    public void checkPower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1:");
        long number1 = sc.nextLong();
        System.out.println("Enter the number2:");
        long number2 = sc.nextLong();
        long output=isPowerOfAnother(number1,number2);
        System.out.println("power of another:"+output);
    }
}
