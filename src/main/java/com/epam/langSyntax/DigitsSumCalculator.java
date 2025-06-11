package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        if (number < 0) {
            // Handle negative numbers
            number = -number;
        }
        while (number > 0) {
            // Extract the last digit
            sum += number % 10;
            // Remove the last digit
            number /= 10;
        }
        System.out.println(sum);
    }

}
