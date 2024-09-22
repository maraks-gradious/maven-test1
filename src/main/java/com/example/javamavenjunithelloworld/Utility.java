package com.example.javamavenjunithelloworld;

import java.util.Scanner;

public class Utility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = s.nextInt();
        if(isLeapYear(year))
        {
            System.out.println(year+"is a leap year");
        }
        else
        {
            System.out.println(year+"is not a leap year");
        }
        s.close();
    }
    public static boolean isLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if( year % 400 == 0)
                {
                    return true;
                }
            }
            else{
                return true;
            }
        }
        return false;
    }
}
