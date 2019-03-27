package chapter12;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumberTester {
    public static void main(String[] args) {

        PhoneNumber someNumber = new PhoneNumber();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number to convert into a string: ");
        int userNum = in.nextInt();
        String userNumString = String.format("%d", userNum);
        ArrayList<String> words = someNumber.getAllPossibleStrings(userNumString);
        System.out.println("All possible words:");
        for(String s: words) {
            System.out.println(s);
        }

    }
}
