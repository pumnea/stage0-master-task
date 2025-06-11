package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        // convert int to string
        String str = Integer.toString(number);
        // reverse string
        String reversed = new StringBuilder(str).reverse().toString();
        // convert string to int
        System.out.println(Integer.parseInt(reversed));
    }

}
