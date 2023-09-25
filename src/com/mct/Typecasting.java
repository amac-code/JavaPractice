package com.mct;

public class Typecasting {
    public static void main(String[] args) {

        //implicit
        byte byteVar = 2;
        int integerV = byteVar;
        System.out.println(integerV);


        //explicit
        float f = 3.2f;
        double d= 10.45;
        int intVar= (int) d;

        byte b = (byte) f;
        System.out.println(intVar);
        System.out.println(b);

    }



}
