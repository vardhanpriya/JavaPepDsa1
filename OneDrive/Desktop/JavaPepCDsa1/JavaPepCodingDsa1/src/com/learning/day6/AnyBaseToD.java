package com.learning.day6;
import java.util.Scanner;
public class AnyBaseToD {


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int dn=getValueInDecimal(n,b);
        System.out.println(dn);

    }

    public static int getValueInDecimal(int n, int b){
        int rv=0;
        int p=1;
        while(n>0){

            int dig=n%10;
            n=n/10;
            rv += dig*p;
            p=p*b;
        }

        return rv;
    }
}









