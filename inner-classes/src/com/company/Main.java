package com.company;

public class Main {

    public static void main(String[] args) {
	    Gearbox mcLaren = new Gearbox(6);
        /* OLD WAY:
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4); WRONG
//        Gearbox.Gear third = new mcLaren.Gear(3, 17.8); WRONG

        System.out.println(first.driveSpeed(1000));
         */
        // Better way:
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));





    }
}
