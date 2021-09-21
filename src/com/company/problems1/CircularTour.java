package com.company.problems1;

import java.util.Scanner;

public class CircularTour {
    int tour(int petrol[], int distance[])
    {
        for(int i=0;i<petrol.length;i++){
            if(i<petrol.length-1&&petrol[i]>distance[i]){
                return i;
            }
            else if(i==petrol.length-1&&petrol[i]>distance[i]){
                return -1;
            }
        }
        return -1;
    }
    public void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int size=sc.nextInt();
        int [] petrol=new int[size];
        int [] distance=new int[size];
        System.out.println("enter the petrols:");
        for(int i=0;i<size;i++){
            petrol[i]=sc.nextInt();
        }
        System.out.println("enter the distance:");
        for(int i=0;i<size;i++){
            distance[i]=sc.nextInt();
        }
        int output=tour(petrol,distance);
        System.out.println(output);
    }
}
