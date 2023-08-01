package HomeWork.DivAcademyTimur.HomeWorkLesson9;

import java.util.Scanner;

public class MethodsLesson9 {

   public static int requiredInt(String s,Scanner console)
    {
        System.out.print(s);
        return console.nextInt();
    }
    public static String requiredString(String s,Scanner console){
        System.out.print(s);
        return console.nextLine();
    }

}
