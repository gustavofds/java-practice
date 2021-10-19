package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone gustavosPhone;
        gustavosPhone = new DeskPhone(123456);
        gustavosPhone.powerOn();
        gustavosPhone.callPhone(123456);
        gustavosPhone.answer();

        gustavosPhone = new MobilePhone(24565);
        gustavosPhone.powerOn();
        gustavosPhone.callPhone(24565);
        gustavosPhone.answer();
    }
}
