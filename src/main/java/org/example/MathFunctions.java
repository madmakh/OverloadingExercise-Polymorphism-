package org.example;

public class MathFunctions {

    //////// addition
    public void add(int a, int b){
        System.out.println("The result is: " + (a+b));
    }

    public void add(double a , double b){
        System.out.println("The result is: " + (a+b));

    }

    //////// substraction
    public void sub(int a, double b){
        System.out.println("The result is: " + (a-b));
    }
    public void sub(int a, int b){
        System.out.println("The result is: " + (a-b));

    }


    //////// multiplication

    public void multiply(int a, int b){
        System.out.println(("The result is: " + (a * b)));


    }
    public void multiply(double a, int b){

        System.out.println(("The result is: " + (a * b)));

    }


    //// division

    public void div(int a, int b){
        System.out.println(("The result is: " + (a/b)));


    }
    public void div(double a, int b){

        System.out.println(("The result is: " + (a/b)));

    }


    ///// absolute value

    public int abs(int a) {
        return Math.abs(a);
    }

    public double abs(double a) {
        return Math.abs(a);
    }


   ///// power

    public void pow(int a, int b){
        System.out.println("The result is: "+Math.pow(a, b));
    }

    public void pow(double a, double b){
        System.out.println("The result is: "+Math.pow(a, b));
    }












}
