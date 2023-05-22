package com.learning.day2;

import java.util.Scanner;
public class ResultGrade {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int marks=sc.nextInt();

        if(marks>90){

            System.out.println(" you are brilliant student well done !!! ");

        } else if(marks>60){

            System.out.println(" you are good  student very good  !!! ");
        }

        else if(marks>40){

            System.out.println(" work hard  for better performance !!! ");
        }

        else{

            System.out.println(" you are failure student please try your best  !!! ");
        }

    }
}
