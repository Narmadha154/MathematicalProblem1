package com.company.problems1;

import java.util.Scanner;

public class PalindromeNumber {
      public long isPalindrome(long N) {
          long[] newNum = new long[10];
          int k = 0;
          long output=0;
          while (N > 0) {
              newNum[k] = newNum[k] * 10 + (N % 2);
              N = N / 2;
              k++;
          }
          for(int i=0,j=k-1;i<=j;i++,j--){
              if(newNum[i]!=newNum[j]){
                  return output;
              }
          }
          output=1;
          return output;

      }
        public void checkPali(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            long number=sc.nextLong();
            long output=isPalindrome(number);
            System.out.println("palindrome number:"+output);
      }
}
