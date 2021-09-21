package com.company.problems1;

import java.util.Scanner;

public class LuckyNumber {
    int counter=2;
    public Boolean isLucky(int num){
        if(counter>num){
            return true;
        }
        if((num%counter)==0){
            return false;
        }
        int nxtPos=num-num/counter;
        counter++;
        return isLucky(nxtPos);
    }
    public void checkLuckyNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if(isLucky(number)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
