package HomeWork.DivAcademyTimur.HomeWorkLesson9;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class HomeWorkTask9 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
//        flashlightTest(console);
//        calculatorTest(console);
        studentManagementSystemTest(console);



        //Hope you'll like my code with student management system. considered Uniqueness of mails. Tried to reduce the amount of code.
        //the only thing are patterns which needs to be deeply investigated practices prior usage.
    }

    static void flashlightTest(Scanner console)
    {
        Flashlight fonar = new Flashlight();
        fonar.selectionScreen(console);

    }
    static void calculatorTest(Scanner console)
    {

            Calculator.calculatorApp(console);

        }

    static void studentManagementSystemTest(Scanner console){

        StudentManageSystem system = new StudentManageSystem();
        system.selectionScreen(console);
        console.close();
    }
}
