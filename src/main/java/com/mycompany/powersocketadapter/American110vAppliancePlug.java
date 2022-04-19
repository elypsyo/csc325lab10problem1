package com.mycompany.powersocketadapter;

public class American110vAppliancePlug implements AmericanPlug{

    @Override
    public void givePower() {
        System.out.println("This is a 110 v 15 amp not the higher 230V");
    }

}
