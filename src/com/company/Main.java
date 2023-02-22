package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("ENTER THE TEMPERATURE IN DEGREE CELSIUS: ");
            Scanner temp = new Scanner(System.in);

            double cel = temp.nextInt();
            System.out.println((cel * 9 / 5) + 32);
        }
    }
}
