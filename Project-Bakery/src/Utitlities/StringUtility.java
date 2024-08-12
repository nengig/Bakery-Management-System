package Utitlities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nengi
 */
public class StringUtility {
    public static String flipChar (String argument){
        String newString = argument.toUpperCase().charAt(0) + argument.substring(1);
        return newString;
    }
}
