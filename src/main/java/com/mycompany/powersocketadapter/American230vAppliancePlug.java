/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapter;

/**
 *
 * @author MoaathAlrajab
 */
public class American230vAppliancePlug implements AmericanPlug{

    @Override
    public void givePower() {
        System.out.println("This is a 230 v 50 amp design not the regular 110v");
    }
    
}
