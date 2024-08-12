/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordering;

import Cakes.*;
import Interfaces.OrderManagement;
import java.util.*;
import javax.swing.JOptionPane; 
/**
 *
 * @author nengi
 */
public class OrderCake implements OrderManagement{
    private Cake [] cakes; // aggregation
    private int orderNum;
    private double total; 
    public OrderCake (int numOfCakes){
        // receives one parameter that represents the number of cake the person wants to order 
        cakes = new Cake [numOfCakes];
        this.total = 0;
        this.orderNum = 000000;
        this.enterOrder(); // calls method to get the order from user 
    }
    public String [] takeCakeInfo (String input){
        // receives as a parameter user input on cake
        String [] IArray = input.split(" "); // split user input into seperate words
        return IArray;  
    }
    @Override
    public void enterOrder (){
        Scanner in = new Scanner (System.in);
        String cakeType;
        String [] IArray;  // will receive value returned by takeCakeInfo 
        boolean countCheck = true; //used to determine if user has entered correct cupcake count
        System.out.println("\n\nYou can choose Cupcakes or an Occasion or a Custom cake");
        for (int i = 0; i < cakes.length; i++){
            System.out.print("Enter the type of cake that you want: "); // prompt user to enter cake type
                cakeType = in.nextLine();
            if (cakeType.equalsIgnoreCase("occasion")){
               //for occassion cake prompt user for flavour and name of occasion
                System.out.println("Enter the flavour and name of the Occasion cake "
                        + "(Holiday, Wedding, Birthday, Anniversary)");
                IArray = this.takeCakeInfo(in.nextLine()); 
                /*
                    IArray[0] is flavour
                    IArray[1] name of occasion
                */
                //polymorphism
                cakes [i] = new OccasionCake(IArray[0], IArray[1]); 
            }else if (cakeType.equalsIgnoreCase("custom")){
                //for custom cake prompt user for flavour, layers and size of cake
                System.out.println("Enter the flavour, ther number of layers (1-4) and size of the cake"
                + "(6\", 8\", 10\" and 12\")"); 
               IArray = this.takeCakeInfo(in.nextLine());
                /*
                    IArray[0] is flavour
                    IArray[1] is number of layers
                    IArray[2] is size of cake
                */
                 //polymorphism
                cakes[i] = new CustomCake (IArray[0], Integer.parseInt(IArray[1]), Integer.parseInt(IArray[2]));
            }else if (cakeType.equalsIgnoreCase("cupcake")){
                //for  cupcake prompt user for flavour, count and weight of cake
               do{ //validation of cake count
                System.out.println("Enter the flavour, count (4 or 6) and weight in ounces (1, 2 or 3)");
                IArray = this.takeCakeInfo(in.nextLine());
                 /*
                     IArray[0] is flavour
                     IArray[1] is cupcake count
                     IArray[2] is weight of cake
                 */
                    try{//trys to see if exception is thrown
                        cakes[i] = new Cupcake (IArray[0], Integer.parseInt(IArray[1]), Integer.parseInt(IArray[2]));//polymorphism
                        countCheck = false; // if exception is not thrown loop ends
                    }catch (IllegalArgumentException e){
                        //if exception is thrown print message and prompt user again
                        System.out.println(e.getMessage());
                    }
                }while(countCheck);
             }
        }
        this.calculateTotal();//call method to calculate total
        
        this.confirmOrder(); // call method to confirm the order 
    } 
     @Override
    public void calculateTotal (){
        // overides calculateTotal in OrderManagement interface
        for (int i = 0; i < cakes.length; i++){
            this.total += cakes[i].getPrice(); // adds totals for all th ecakes in order
        }
    }
    @Override
    public void confirmOrder(){
       // overides confirmOrder in OrderManagement interface
         int choice = JOptionPane.showConfirmDialog(null, this.toString(), "Confirm Order", JOptionPane.YES_NO_OPTION);
          System.out.println(choice);
        if (choice == JOptionPane.YES_OPTION) {
            // User confirms order
            this.placeOrder();  // Call method to place order
        }
        
    }
    @Override
    public void placeOrder(){
        // overides placeOrder in OrderManagement interface
        //if user confirms order a 6 dig order num will be created and a confirmation message will display
        Random rand = new Random(); // will be used to create random numbers 
        this.orderNum = rand.nextInt(1000000); // creates a random 6 digit number
        JOptionPane.showMessageDialog(null, "Thank You\nYour order has been placed\nYour order number is " + this.orderNum);
    }
   
    @Override
    public String toString (){
        String output = "";
        for (int i = 0; i < cakes.length; i++){
            output += cakes[i].toString() + "\n";
        }
        output +=String.format("Total amount of the order is $%.2f", this.total);
        return output;
    }
}
