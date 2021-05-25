package com.maximatech.apifrete.util;

public class MathUtil {

    public static double randomNumber(double min, double max){
        return min + (Math.random() * (max - min));
    }
    
}
