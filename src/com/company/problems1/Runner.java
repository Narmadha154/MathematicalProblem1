package com.company.problems1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the program number:");
        int number=sc.nextInt();
        switch(number) {
            case 1:
                NumberOfPaths path = new NumberOfPaths();
                path.findPath();
                break;
            case 2:
                SquareRoot sqrt= new SquareRoot();
                sqrt.findSquareRoot();
                break;
            case 3:
                BalancedNumber num= new BalancedNumber();
                num.checkBalance();
                break;
            case 4:
                LuckyNumber lucky= new LuckyNumber();
                lucky.checkLuckyNumber();
                break;
            case 5:
                PalindromeNumber pali= new PalindromeNumber();
                pali.checkPali();
                break;
            case 6:
                OddFactor factor= new OddFactor();
                factor.findCount();
                break;
            case 7:
                DoorsOpen open= new DoorsOpen();
                open.noOfOpenDoors();
                break;
            case 8:
                PerfectNumber perfect= new PerfectNumber();
                perfect.checkPrfNum();
                break;
            case 9:
                MaximumVolume vol= new MaximumVolume();
                vol.findMaxVolume();
                break;
            case 10:
                CircularTour tour= new CircularTour();
                tour.getInput();
                break;
            default:
                System.out.println("no program");
        }
    }
}
