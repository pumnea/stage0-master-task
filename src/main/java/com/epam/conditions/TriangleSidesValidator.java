package com.epam.conditions;

/**
 * Validates whether three side lengths can form a valid triangle based on the triangle inequality theorem
 * and positive side length constraints.
 */
public class TriangleSidesValidator {

    private static final String VALID_TRIANGLE_MESSAGE = "This is a valid triangle";
    private static final String INVALID_TRIANGLE_MESSAGE = "This is not a valid triangle";

    /**
     * Validates if the given side lengths form a valid triangle.
     * A triangle is valid if all sides are positive and satisfy the triangle inequality theorem:
     * the sum of any two sides must be greater than the third side.
     *
     * @param firstSide  the length of the first side
     * @param secondSide the length of the second side
     * @param thirdSide  the length of the third side
     */
    public void validate(double firstSide, double secondSide, double thirdSide) {
        System.out.println(isValid(firstSide, secondSide, thirdSide)
                ? VALID_TRIANGLE_MESSAGE
                : INVALID_TRIANGLE_MESSAGE);
    }

    /**
     * Checks if the given side lengths form a valid triangle.
     *
     * @param firstSide  the length of the first side
     * @param secondSide the length of the second side
     * @param thirdSide  the length of the third side
     * @return true if the sides form a valid triangle, false otherwise
     */
    private boolean isValid(double firstSide, double secondSide, double thirdSide) {
        // Check for positive sides
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            return false;
        }
        // Check triangle inequality theorem
        return firstSide + secondSide > thirdSide &&
               firstSide + thirdSide > secondSide &&
               secondSide + thirdSide > firstSide;
    }
}