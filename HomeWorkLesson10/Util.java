package HomeWork.DivAcademyTimur.HomeWorkLesson10;

import java.util.Scanner;

public class Util {
    public static int requiredInt(String s, Scanner console)
    {   boolean active=true;
        int number = 0;
        while(active) {
            System.out.print(s);
            String input = console.nextLine();


            if (intChecker(input)) {
                number = Integer.parseInt(input);
                active=false;

            } else {
                System.out.println("\nWrong format of Number inputted");

            }
        }return number;
    }
    public static String requiredString(String s,Scanner console){
        System.out.print(s);
        return console.nextLine();
    }

    public static boolean intChecker(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
