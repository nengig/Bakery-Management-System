package Cakes;

import Interfaces.BakeryConstants;
import javax.swing.JOptionPane; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nengi
 */
public class OccasionCake extends Cake{
    private String occasion;// name of the occasion
    
    public OccasionCake (String flavour, String name){
        super (flavour); // set flavour using superclass constructor
        this.occasion = name;
        this.calculatePrice(); // call method to calculate and set the price
    }
    @Override
    protected void calculatePrice(){
        // overides calculatePrice in Cake superclass
        // calls cakeArray in BakeryConstants interface
        for (int i = 0; i < BakeryConstants.cakeArray.length; i ++){
            // check the array of occasion cakes stored in BakeryConstants
            if (this.occasion.equalsIgnoreCase(BakeryConstants.cakeArray[i][0])){
                // if the name passed is found in the array of occasion cakes stored in BakeryConstants
                this.occasion = BakeryConstants.cakeArray[i][0]; //resets occasion so that 1st letter is capitalized
                // convert price to a double and set price
                this.price = Double.parseDouble(BakeryConstants.cakeArray[i][1]); 
            }
        }
    }
    @Override
    public String toString (){
        // adds to superclass toString the occassion for the cake
        String output = super.toString();
            output += occasion + " cake";
        return output;
    }
}
