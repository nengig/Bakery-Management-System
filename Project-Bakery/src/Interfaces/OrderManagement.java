/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author nengi
 */
public interface OrderManagement {
    // used in any class that will require making an order
    // in this program it will be implemented in OrderCake class
    void enterOrder();
    void calculateTotal();
    void confirmOrder();
    void placeOrder();
    
}
