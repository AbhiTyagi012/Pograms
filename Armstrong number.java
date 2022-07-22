package com.company;

import java.util.Scanner;

public class armstrong {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        int sum = 0;
        while(temp>0){
            digits++;
            temp = temp/10;
        }
        temp = n;
        while(temp>0){
            int rem = temp%10;
            sum = sum + (int)Math.pow(rem,digits);
            temp= temp/10;
        }
        if(n==sum)
            System.out.println("Given number is an Armstrong number");
        else
            System.out.println("Given number is not an armstrong number");
    }
}
