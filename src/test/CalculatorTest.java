package test;

import dominio.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int[] numbers = new int[]{1,2,3,4,5,6};
        System.out.println(calc.sumTwoNumbers(2,4));

        calc.sumVarArgs(1,2,3,4);

    }
}
