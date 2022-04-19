/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapter;

/**
 *
 * @author MoaathAlrajab
 */
public class AmericanToEuropeanPlugAdapter implements EuropeanPlug{
    
    private AmericanPlug plug;

    public AmericanToEuropeanPlugAdapter(AmericanPlug plug){
        this.plug= plug;
        
    }
    @Override
    public void providePower() {
            plug.givePower();

    }
    
    
}
