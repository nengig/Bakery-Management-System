package Cakes;

import Interfaces.Expires;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane; 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nengi
 */
public class Cupcake extends Cake implements Expires{
    private int count;//num of cupcake (4 or 6)
    private int weight; //weight of cupcake (1,2 or 3oz)
    private LocalDate expiry;
    
    public Cupcake (String flavour, int count, int weight){
        super(flavour);
        if (count == 4 || count == 6){
            this.count = count;        
        }else{ // throws an excpetion if count is not 4 or 6
            throw new IllegalArgumentException ("Cupcake count must be 4 or 6");
        }
        
        this.weight = weight;
        this.setExpiryDate(); // call method to set the expiry date
        this.calculatePrice();// call method to calculate and set the price 
    }
    @Override
    protected void calculatePrice (){
        // overides calculatePrice in Cake superclass
        this.price = (2 * this.weight) * this.count;
    }
    @Override
    public void setExpiryDate (){
        //// overides setExpiryDate in expires interface
        this.expiry = LocalDate.now().plusDays(3); // set expiry date to 3 days from today     
    }
   private String formatDate(LocalDate date){
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); // formate date to be day-month-year
    }
    @Override
    public String toString (){
        // adds to superclass toString the count, weight and expiry date of the cake

        String output = super.toString();
            output += count + "ct, " + weight + "oz Buttercream cupcakes and good till " + this.formatDate(expiry);
        return output;
    }
}
