package com.learning.day7;
import java.util.Scanner;
public class FindElementArr {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;  i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int idx=-1;
        for(int i=1; i<arr.length;i++){

            if(arr[i]==data){
                idx=1;
                break;
            }
        }

          System.out.println(idx);
    }

}
