package com.driver;

import com.csc.com.csc.Menu;

public class Driver {
    public static void main(String[] args) {
        Menu myMenu = new Menu();
        myMenu.callMenu(1, 100);
        myMenu.callMenu(-10, 10);
    }

    
}
