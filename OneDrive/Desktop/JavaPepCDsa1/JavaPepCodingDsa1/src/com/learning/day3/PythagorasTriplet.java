package com.learning.day3;
import java.util.Scanner;

public class PythagorasTriplet {
    public static void main(String[] argas){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int maxx=a;
        if(b>=maxx){

            b=maxx;

        }
        if (c >= maxx) {

            maxx=c;
        }
        if(maxx==a){

            boolean flag=((b*b + c*c) == (a*a));
            System.out.println(flag);

        } else if(maxx==b){
            boolean flag=((a*a + c*c) ==(b*b));
            System.out.println(flag);

        } else{
            boolean flag = ((b*b + a*a)==(c*c));

        }
    }
}
