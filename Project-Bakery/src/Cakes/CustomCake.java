package Cakes;

import Interfaces.BakeryConstants;
import java.util.Scanner;
import javax.swing.JOptionPane; 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nengi
 */
public class CustomCake extends Cake{
    private int NumOfLayers; // layers in the cake (1-4)
    private int size; // diameter of cake (6, 8, 10 or 12 inches)
    
    
    public CustomCake (String flavour, int layers, int size){
        super(flavour);// set flavour using superclass constructor
        this.NumOfLayers = layers;
        this.size = size; 
        this.calculatePrice();// call method to calculate and set the price 
    }
    @Override
    protected void calculatePrice(){
        // overides calculatePrice in Cake superclass
        // calls BASEPRICE, LAYERPRICE and SIZEPRICE in BakeryConstants interface
        this.price = BakeryConstants.BASEPRICE + (this.NumOfLayers * BakeryConstants.LAYERPRICE)
                + (this.size * BakeryConstants.SIZEPRICE);
    }
    @Override
    public String toString (){
                // adds to superclass toString the num of layers and size of the cake
        String output = super.toString();
            output += "cake with " + this.NumOfLayers + " layers and size is " + size + " inches";
        return output;
    }
}
