package com.company.top100codes;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
//        int flag=0;
//        if(num<2){
//            flag++;
//        }
//        else{
//            for(int i=2;i<Math.sqrt(num);i++){
//                if(num%i==0){
//                    flag++;
//                    break;
//                }
//            }
//        }
//        if(flag==0){
//            System.out.println(num+" is a prime number!");
//        }
//        else{
//            System.out.println(num+" is not a prime number!");
//        }

        // Using recursion
        int i=2;
        boolean isPrime = true;
        isPrime = checkPrime(num,i);

        String result = isPrime?"prime":"not prime";
        System.out.println(result);
    }
    static boolean checkPrime(int num,int i){
        if(num<2)
            return false;
        if(num==i)
            return true;
        if(num%i==0)
            return false;
        i++;
        return checkPrime(num,i);
    }
}
