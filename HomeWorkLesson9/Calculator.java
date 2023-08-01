package HomeWork.DivAcademyTimur.HomeWorkLesson9;

import java.util.Scanner;

public class Calculator {

    static String inputFNumb= "Please input First number: ";
    static String inputSNumb = "Please input Second number: ";
    static String inputNumb = "Please input number: ";
    static String zeroDivide = "\nNumbers cannot be divided to 0.Please Try again";
    static String inputPower = "Please input power of the number";

    static void sum( Scanner console)
    {   int first = MethodsLesson9.requiredInt(inputFNumb,console);
        int second = MethodsLesson9.requiredInt(inputSNumb,console);
        System.out.println(first + " + " + second +" = " +(first+second)+"\n\n");

    }
    static void subtraction(Scanner console)
    {
        int first = MethodsLesson9.requiredInt(inputFNumb,console);
        int second = MethodsLesson9.requiredInt(inputSNumb,console);
        System.out.println(first + " - " + second +" = " +(first-second)+"\n\n");

    }
    static void multiply(Scanner console)
    {
        int first = MethodsLesson9.requiredInt(inputFNumb,console);
        int second = MethodsLesson9.requiredInt(inputSNumb,console);
        System.out.println(first + " * " + second +" = " +(first*second)+"\n\n");


    }
    static void divide(Scanner console)
    {
        double first = MethodsLesson9.requiredInt(inputFNumb,console);
        double second = MethodsLesson9.requiredInt(inputSNumb,console);
        if(second==0)
        {
            System.out.println(zeroDivide);

        }
        else
        {
            double result =first/second;
            System.out.printf("%.0f / %.0f = %.1f\n\n",first,second,result);
        }

    }//Payed attention to Zero division,and double result taken with 1 number post Point.
    static int factorial(int first)
    {
        if(first==1)
        {
            return 1;
        }

        return first*factorial(first-1);
    }//Factorial logic
    static void factorialOptionCalc(Scanner console)
    {
       int number=MethodsLesson9.requiredInt(inputNumb,console);
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result +"\n\n");
    }//Method to use in calc with Scanner input
    static void powerOfN(Scanner console)
    {
        int first = MethodsLesson9.requiredInt(inputFNumb,console);
        int power = MethodsLesson9.requiredInt(inputPower,console);
        double num = first;
        double pow = power;


         int result = (int) Math.pow(num,pow);
        System.out.println("Number " + first + " in Power of " +power+ " = " +result+"\n\n");
    }//Wanted to use Math.pow method . that is why code is little bigger

    static int selectScreen(Scanner console)
    {
        System.out.println("----------------Calculator App--------------------------\n" +
                "Choose operation: \n" +
                "[1].Sum\n" +
                "[2].Subtraction\n" +
                "[3].Multiply\n" +
                "[4].Divide\n" +
                "[5].Factorial\n" +
                "[6].Power of N\n" +
                "[0].Exit Program");
        return console.nextInt();
    }//Main selection screen
    static void calculatorApp(Scanner console)
    {   boolean active = true;
        while(active)
        {
            int option = selectScreen(console);

            switch(option)
            {
                case 0:
                    System.out.println("Good Bye!");
                    active=false;
                    break;
                case 1:
                    sum(console);
                    break;
                case 2:
                    subtraction(console);
                    break;
                case 3:
                    multiply(console);
                    break;
                case 4:
                    divide(console);
                    break;
                case 5:
                    factorialOptionCalc(console);
                    break;
                case 6:
                    powerOfN(console);
                    break;
                default:
                    System.out.println("Option is invalid!Try again");
            }
        }
    }//Method to run the Calculator APP,switch logic inside
}
