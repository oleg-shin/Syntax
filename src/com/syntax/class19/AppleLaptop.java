package com.syntax.class19;

import com.syntax.class20.Laptop;

public class AppleLaptop extends Laptop {
    void printMake(){
        // can't access because in different package (default)
        // can access if it's protected
        System.out.println(make);
    }
}
