package com.johncodes;


public class MagicCalculator extends CalcPractice {

    public static double square (double a){
        return Math.sqrt(a);
    }
    public static double sine (double a){
        return Math.sin(a);
    }
    public static double coSine (double a){
        return Math.cos(a);
    }
    public static double tangent (double a){
        return Math.tan(a);
    }
    public static double factorial (int num, int i, double factorial){
        num = 5;
        i = 1;
        factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        return (factorial);
    }
}
