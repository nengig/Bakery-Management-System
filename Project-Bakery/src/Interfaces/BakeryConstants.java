/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author nengi
 */
// holds constants for each type of cakes 
public interface BakeryConstants {
    
    // for custom cakes
    double LAYERPRICE = 3; // each layer of cake is $3
    double SIZEPRICE = 1; // each inch of cake is $1
    double BASEPRICE = 30; // base price of cake is $30
    // for occasion cakes 
        // holds the name of occassion and price for each occasion
    String [][] cakeArray = new String [][]
                             {{"Holiday", "30"},{"Birthday", "40"},
                              {"Anniversary", "50"}, {"Wedding", "60"}};
                /*
                    cakeArray[row][0] hold occasion name
                    cakeArray[row][1] hold price for that occasion cake 
                */
}
