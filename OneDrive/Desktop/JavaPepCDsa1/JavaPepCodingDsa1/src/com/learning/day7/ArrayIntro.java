package com.learning.day7;
import java.util.Scanner;

public class ArrayIntro {

    public static void main(String[]args) {
        Scanner sc=new Scanner (System.in);
         int[] arr;
        arr=new int [6];

        arr[0]=65;
        arr[1]=74;
        arr[2]=86;
        arr[3]=77;
        arr[4]=98;
         arr[5]=66;
        //System.out.println(arr.length);
          for(int i=0; i<arr.length; i++){

              System.out.println(arr[i]);
          }
    }
}
