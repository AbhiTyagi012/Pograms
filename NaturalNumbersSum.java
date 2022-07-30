package com.company.top100codes;

import java.util.Scanner;

public class FirstNNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        // Using for loop
        for(int i=0;i<=num;i++){
            sum += i;
        }
        System.out.println("Sum: "+sum);
        // Using formula to find sum
        int result = (num*(num+1))/2;
        System.out.println("Result using formula: "+result);

        // Using recursion
        int add = findSum(num);
        System.out.println("Using recursion:"+add);

    }
    static int findSum (int num) {
        if(num==0){
            return num;
        }
        return num + findSum(num-1);
    }
}
