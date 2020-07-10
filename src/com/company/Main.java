package com.company;

public class Main
{
    public static void main(String[] args)
    {

        for (int a = 1; a <= 10; a++)
        {
            System.out.println();
            for (int c = 1; c <= 10; c++)
            {
                System.out.format("%4s", a * c);
            }
        }
    }
}