package com.company.problems1;

import java.util.Scanner;

public class NumberOfPaths {
    public static void findPath(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int col=sc.nextInt();
        int [] [] mat=new int[row][col];
        System.out.println("Enter the elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int [] []count=new int[row][col];
        for(int i=0;i<row;i++){
            count[i][0]=1;
        }
        for(int j=0;j<col;j++){
            count[0][j]=1;
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                count[i][j]=count[i-1][j]+count[i][j-1];
            }
        }
        System.out.println(count[row-1][col-1]);
    }
}
