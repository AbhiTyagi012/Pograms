package com.company.top100codes;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        while(num!=0){
         sum += num%10;
         num = num/10;
        }
        System.out.println(sum);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        System.out.println("Sum of digits using recursion: "+getSum(n));
    }

    // Using Recursion
    static int getSum(int num){
        if(num==0)
            return 0;
        return (num%10) + getSum(num/10);
    }
}
