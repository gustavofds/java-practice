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

    }
}
