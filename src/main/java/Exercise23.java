/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String q1 = input.next();

        if (q1 == "yes") {
            System.out.print("Are the battery terminals corroded? ");
            String q2 = input.next();
            if (q2 == "yes") {
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            } else if (q2 == "no") {
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }
        } else if (q1 == "no") {
            System.out.print("Does the car make a slicking noise? ");
            String q3 = input.next();
            if (q3 == "yes") {
                System.out.print("Replace the battery. ");
                System.exit(0);
            } else if (q3 == "no") {
                System.out.print("Does the car crank up but fail to start? ");
                String q4 = input.next();
                if (q4 == "yes") {
                    System.out.print("Check spark plug connections.");
                    System.exit(0);
                } else if (q4 == "no") {
                    System.out.print("Does the engine start and then die? ");
                    String q5 = input.next();
                    if (q5 == "yes") {
                        System.out.print("Does you car have fuel injection? ");
                        String q6 = input.next();
                        if (q6 == "yes") {
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        } else if (q6 == "no") {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    } else if (q5 == "no") {
                        System.out.print("This should not be possible.");
                    }

                }
            }
        }
    }
}
