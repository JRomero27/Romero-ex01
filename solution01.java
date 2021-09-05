package exercise01;
/*
 *  UCF COP3330 Fall 2021 Exercise 1 Solution
 *  Copyright 2021 Joshua Romero
 */

import java.util.Scanner;

public class solution01
{
    public static void main(String[] args)
    {

    System.out.println("What is your name? ");

    Scanner input = new Scanner(System.in);
    String name = input.next();

    System.out.println("Hello, " + name + ", nice to meet you!");

    }
}
