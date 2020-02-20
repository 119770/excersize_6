package edu.cscc;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {



        System.out.println("Please enter a string: ");
        String userString = promptString();
        System.out.println(userString);

        System.out.println("Please enter an integer: ");
        int userInt = promptInt();
        System.out.println("You entered the integer: " + userInt);

        System.out.println("Please enter a double: ");
        double userDouble = promptDouble();
        System.out.println("You entered the double: " + userDouble);




    }

    static String promptString() {
        boolean pass = false;
        String userString = "";

        while(pass == false) {
            try {

                userString = input.nextLine();
                int userInt = Integer.parseInt(userString);
                System.out.println("Please enter a STRING: ");

            } catch (Exception e) {
                pass = true;
            }
        }

        return "You entered the string: " + userString;
    }

    static int promptInt() {
        boolean pass = false;
        int userInt = 0;

        while(pass == false) {
            try {
                userInt = input.nextInt();
                pass = true;

            } catch(Exception e) {
                System.out.println("Please enter an INTEGER: ");
                input.next();


            }
        }

        return userInt;
    }

    static double promptDouble() {
        boolean pass = false;
        double userDouble = 0.0;

        while(pass == false) {
            try {
                userDouble = input.nextDouble();
                pass = true;
            } catch(Exception e) {
                System.out.println("Please enter a double: ");
                input.next();
            }
        }

        return userDouble;
    }


}
