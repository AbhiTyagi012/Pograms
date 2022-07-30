package com.company.top100codes;


import java.util.Scanner;

public class positive_negative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Brute- Force approach
//        if(n>0){
//            System.out.println(n+" "+"is Positive!");
//        }else if(n<0){
//            System.out.println(n+" "+"is Negative!");
//        }else{
//            System.out.println(n+" "+"is Zero!");
//        }
        // Using ternary operator
        if(n==0){
            System.out.println("Zero");
        }else{
            String result = n>0?"Number is positive":"Number is Negative";
            System.out.println(result);
        }
    }
}
