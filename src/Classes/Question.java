/*
 * Copyright (c) 2020. This is my code to learn java
 */

package Classes;

import java.io.IOException;

public class Question {

    char choice;

    public void message() throws IOException {

        /*
        days = 20; //This requires work, as someone might want to commute shorter amount of days
        busfare = 3; //Ideally (in the future) this needs to be always up to date
        trainfare = 2.5; //Ideally (in the future) this needs to be always up to date
         */

        System.out.println("Which commute do you use in the Month\n");
        System.out.println("  1. Classes.Bus");
        System.out.println("  2. Classes.Train");
        System.out.println("  3. Classes.Bus and Classes.Train\n");
        System.out.print("Commute option: ");
        choice = (char) System.in.read();
        System.out.println("");

    }
}
