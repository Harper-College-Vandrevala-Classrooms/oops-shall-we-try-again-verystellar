package com.csc;
import java.util.InputMismatchException;
import java.util.Scanner;
// Your code goes here!
public class Menu{
    
    public int callMenu(int b1, int b2){
        Scanner newScanner = new Scanner(System.in);
        boolean val = false;
        int num = 0;
        while(val != true){
        System.out.println("Enter number between (" + b1 + "," + b2 + "): ");
        try { 
            String boo = newScanner.nextLine();
            int i = Integer.valueOf(boo);
            if (i < b1 || i > b2) {
                System.out.println("Value out of bounds\n");
                
            } else {
                val = true;
                System.out.println("Value chosen by user was " + i);
                num = i;
            }
            }
        
        catch (NumberFormatException ex){
            System.out.println("Invalid Value\n");
        }
        }
        return num;
    }
}

