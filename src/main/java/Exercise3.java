/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input.nextLine();

        System.out.println(author + " says, \"" + quote + ".\"");
    }
}
