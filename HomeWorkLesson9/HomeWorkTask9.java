package HomeWork.DivAcademyTimur.HomeWorkLesson9;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class HomeWorkTask9 {
    public static void main(String[] args) {
//        flashlightTest();
//        calculatorTest();
//        studentManagementSystemTest();

        //Hope you'll like my code with student management system. considered Uniquenes of mails. Tried to reduce the amount of code.
        //the only thing are patterns which needs to be deeply investigated practices prior usage.
    }

    static void flashlightTest()
    {Scanner console = new Scanner(System.in);
        Flashlight fonar = new Flashlight();
        fonar.selectionScreen(console);
        console.close();
    }
    static void calculatorTest()
    {
            Scanner console = new Scanner(System.in);
            Calculator.calculatorApp(console);
            console.close();

        }

    static void studentManagementSystemTest(){
        Scanner console = new Scanner(System.in);
        StudentManageSystem system = new StudentManageSystem();
        system.selectionScreen(console);
        console.close();
    }
}
