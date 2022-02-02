package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Import Scanner first; (i.e import.util.Scanner) Scanner tells us that we will be getting "UserInput" from user at some point during the code
        Scanner scan = new Scanner(System.in);

        System.out.println("You are in a land full of dragons.In front of you, \n " +
                           "you see two caves. In one cave, the dragon is friendly \n " +
                           "and will share his treasure with you. The other dragon is \n " +
                           "greedy and hungry and will eat you on sight \n" +
                           "which cave will you go into? (1 or 2)");
        //because we know the user only has the option to choose from 1 or 2, we can use the primitive type "byte" which has numbers that range from -128, 127
        byte userChoose = scan.nextByte();

        if(userChoose == 1) {
            System.out.println("You approach the cave... \n " +
                    "It is dark and spooky... \n " +
                    "A large dragon jumps out in front of you! \n" +
                    "(Oh you scared now cousin!) He opens his jaws and... \n" +
                    "Gobbles you down in one bite! (Bon appetit)");
        }else if(userChoose == 2) {
            System.out.println("Well Well Well! Smart Choice \n " +
                    "And for being such a smart warrior \n" +
                    "I'd like to reward you with some of my TREASURE! ENJOY!");
        }else System.out.println("That is not a valid choice, SCRAM!");


    }
}
