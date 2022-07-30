package com.company.top100codes;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Brute Force Approach
//        if(num%2==0){
//            System.out.println(num + " is Even");
//        }else{
//            System.out.println(num + " is Odd");
//        }
//        // Ternary Operator
        String result = num%2==0?"Even":"Odd";
        System.out.println(result);

       
    }
}
