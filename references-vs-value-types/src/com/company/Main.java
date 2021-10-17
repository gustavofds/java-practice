package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	    int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("(after change) myIntValue = " + myIntValue);
        System.out.println("(after change) anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        myIntArray[2] = 23;

        System.out.println("(after change) myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("(after change) anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] { 4, 5, 6, 7, 8 };
        modifyArray(myIntArray);

        System.out.println("(after modify) myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("(after modify) anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;

        array = new int[] {1, 2, 3, 4, 5};
    }
}
