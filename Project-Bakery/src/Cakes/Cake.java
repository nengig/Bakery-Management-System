package Cakes;
import Utitlities.StringUtility;
import javax.swing.JOptionPane; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nengi
 */
public abstract class Cake {
    private String flavour;
    protected double price;
    public Cake (String flavour){
        this.flavour = flavour;
    }
    public double getPrice(){
        return price;
    }
    protected abstract void calculatePrice();
    public String toString (){
        // prints out price(2 decimal places) and flavour (with first letter capitalized) of the cake 
        String output = String.format("$%.2f", price) + " for " + StringUtility.flipChar(flavour) + " flavoured ";
        return output;
    }
}
