package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MathFunctions mathFunctions = new MathFunctions();
        mathFunctions.add(3,4);
        mathFunctions.add(4.3,5.4);
        mathFunctions.sub(10,5);
        mathFunctions.sub(10, 5.6);
        mathFunctions.multiply(4.3,5);
        mathFunctions.multiply(4,3);
        mathFunctions.div(20,5);
        mathFunctions.div(45.5,5);
        System.out.println("The result is: "+mathFunctions.abs(6));
        System.out.println("The result is: "+mathFunctions.abs(5.4));
        mathFunctions.pow(2,3);
        mathFunctions.pow(2.4, 1.2);


    }
}