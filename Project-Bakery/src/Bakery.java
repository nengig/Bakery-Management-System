
import Ordering.OrderCake;
import java.util.Scanner;
import javax.swing.JOptionPane; 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nengi
 */
public class Bakery {
    Bakery (){
        OrderCake order; // create referance variable for ordercake object
        Scanner in = new Scanner (System.in);
        System.out.println("******Welcome to my cake shop******");
        System.out.print("How many cakes would you like to order? ");
            order = new OrderCake (in.nextInt());//create new orderCake object with user input as parameter

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Bakery ();
    }
    
}
