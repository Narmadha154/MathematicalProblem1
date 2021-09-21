package com.company.problems1;

import java.util.Scanner;

public class OddFactor {
    public static long count(int N)
    {
        long oddFactor=0;
        for(int i=1;i<=N;i++){
            int count=0;
            for(int j=1;j<=N;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count%2!=0){
                oddFactor++;
            }
        }
        return oddFactor;
    }
    public void findCount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        long output=count(number);
        System.out.println("count of numbers with odd factor:"+output);
    }
}
