package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;

        // /
        // %

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar was true");
        } else {
            System.out.println("wasCar was false");
        }

        int age = 17;
        boolean isAdult = age >= 18 ? true : false;
        if (isAdult) {
            System.out.println("Client is adult");
        }

        double myDouble = 20.00;
        double secondDouble = 80.00;
        double myResult = (myDouble + secondDouble) * 100.00;
        double myRemainder = myResult % 40d;
        boolean myBoolean = myRemainder == 0 ? true : false;

        System.out.println(myRemainder);

        System.out.println(myBoolean);

        if (!myBoolean) {
            System.out.println("Got some remainder");
        }

    }
}
