package com.ga.superhero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Superhero {

    public static int askSuperhero (List<String> arr) {
        System.out.println("Which superhero do you want to start with? (Please input a number)");
        for (int i = 0; i <arr.size(); i++) System.out.println(i+1 + ". " + arr.get(i));
        int superheroNumber = 0;

        try {
            superheroNumber = parseInt(askQuestion());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Try again");
            superheroNumber = parseInt(askQuestion());
        }

        return superheroNumber;
    }
    public static String askName(String str) {
        System.out.println("What is the real name of " + str);
        return askQuestion();
    }
    public static String askCity(String str) {
        System.out.println("What city does " + str + " live in?");
        return askQuestion();
    }

//    public static String askPower (String str) {
//        System.out.println("What power does " + str + " have?");
//        return askQuestion();
//    }


//    public static String username () {
//        System.out.println("What's your name");
//        return askQuestion();
//    }

    public static String declareWinner (int wrongs, int corrects) {
        if (wrongs > corrects) {
            return "You lost with " + wrongs + " wrong answers";
        } else if (corrects > wrongs) {
            return "You won with " + corrects + " correct answers";

        } else {
            return "You lost or had a tie";
        }
    }

    public static String askQuestion () {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}
