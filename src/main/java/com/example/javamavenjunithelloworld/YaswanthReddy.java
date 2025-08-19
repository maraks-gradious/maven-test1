package com.example.javamavenjunithelloworld;

import java.io.PrintStream;


public class YaswanthReddy {
    public void printNumbers(PrintStream printer) {
        for(int i=1;i<=10;i++){
            printer.println(i);
        }
        printer.println("Finished printing numbers.");
    }

}