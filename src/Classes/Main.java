package Classes;

import java.io.IOException;

class Main {

    public static void main(String args[]) throws IOException {

        char choice;

        System.out.println("Which commute do you use in the Month\n");
        System.out.println("  1. Bus");
        System.out.println("  2. Train");
        System.out.println("  3. Bus and Train\n");
        System.out.print("Commute option: ");
        choice = (char) System.in.read();
        System.out.println("");




        if (choice == '1') {
            System.out.println("Fuck you");
        }
        if (choice == '2') {
            System.out.println("I said Fuck you");
        }
        if (choice == '3') {
            System.out.println("I said Fuck you motherfucker");
        } else {
            System.out.println("Read the fucking instruction  correctly and choose the right fucking option, fucker!!");
        }

    }


}





  /* For John:

                1. when I run this program in a loop, then the following run of it, outputs the statements twice, why is that?
                            To replicate: run the program, then provide the value, observe the output.

                 */