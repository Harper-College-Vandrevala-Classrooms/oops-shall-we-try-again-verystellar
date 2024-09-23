package com.csc.com.csc;
import java.util.Scanner;
// Your code goes here!
public class Menu{
    
    public int callMenu(int b1, int b2){
        Scanner newScanner = new Scanner(System.in);
        boolean val = false;
        int num = 0;
        while(!val){
        System.out.println("Enter number between (" + b1 + "," + b2 + "), enter 'exit' to leave them menu: ");
        String boo = newScanner.nextLine();
        if(boo.equals("exit")){
            throw new RuntimeException("Menu exited");

        }
            try {
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
    public int callMenu(int b1, int b2,int def){
        Scanner newScanner = new Scanner(System.in);
        boolean val = false;
        int num = 0;
        while(!val){
            System.out.println("Enter number between (" + b1 + "," + b2 + "), enter nothing to use the default value of " + def + ", enter 'exit' to leave them menu: ");
            String boo = newScanner.nextLine();
            if(boo.equals("exit")){
                throw new RuntimeException("Menu exited");

            }
            if (boo.equals("")){
                System.out.println("Value chosen by user was " + def);
                return def;
            }
            try {
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

