package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int result = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(result);
    }

}
