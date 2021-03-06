/*
* Author: Mehdi Hachimi
* License: MIT
* Data provided by Financial Modeling Prep
*/

package control;


import utils.CasesCTLR;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // user inserts stock
        Scanner scan = new Scanner(System.in);
        System.out.println("What stock are you interested in right now ?");
        String stock = scan.nextLine();

        // user then chooses which of the THREE use cases he wants
        System.out.println("We have three use cases (choose one): \n" +
                "(1) Basic Information \n" +
                "(2) Most Essencials \n" +
                "(3) Financial Statements");
        int choice = scan.nextInt();


        // program makes the necessary api calls and shows the user what he wants.
        CasesCTLR controller = new CasesCTLR();

        controller.serve(stock, choice);



    }
}
