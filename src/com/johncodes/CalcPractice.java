package com.johncodes;

public class CalcPractice {
    public static int addInts (int a, int b){
      return (int)a+b;
    }
    public static int subtractInts (int a, int b){
        return (int)a-b;
    }
    public static int multiplyInts (int a, int b){
        return (int)a*b;
    }
    public static int divideInts(int a, int b){
        return  (int)a/b;
    }
    public static int squareInt (int a){
        return  (int)a*a;
    }
    public static void main(String[] args) {
        System.out.println(divideInts(4,2));

    }
}
