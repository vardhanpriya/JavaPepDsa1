package com.learning.day8;
import java.util.Scanner;
import java.util.Stack;

public class StackIntro {

    public static void main(String[] args){

        Stack<Integer> st=new Stack<>();
          st.push(10);
          System.out.println(st + " -> " + st.peek() + " " + st.size());
          st.push(20);
        System.out.println(st + " -> " + st.peek() + " " + st.size());
        st.push(30);
        System.out.println(st + " -> " + st.peek() + " " + st.size());
        st.push(40);
        System.out.println(st + " -> " + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + " -> " + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + " -> " + st.peek() + " " + st.size());
         }

    }