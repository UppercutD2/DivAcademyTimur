package Lesson4.Homework;

public class Leeson4_Loops_HomeWork {
    public static void main(String[] args) {
        discriminantFinder(1,-7,10);

    }

    public static int reverseNumberTask3_1(int a){
        System.out.println("You entered number : " + a);
        String s = ""+a;
        char[] c = s.toCharArray();
        char[] reverseArray = new char[c.length];
        String str="";
        for(int i=0;i<c.length;i++)
        {
            reverseArray[i] = c[c.length - 1 - i];
            str+=reverseArray[i];
        }
        System.out.println("Reversed number is : " + str);
        return Integer.parseInt(str);
    }

    public static void oddNumberPrintTask3_2(int a){
        for(int i =0;i<=a;i++)
        {
            if(i%2==1||i==1)
            {
                System.out.println(i);
            }
        }
    }

    public static void discriminantFinder(int a,int b, int c){
        //ax^2 +bx+c=0
            double d = (b*b*1.0)-(4*a*c);
        if(d>0)
        {
            System.out.println("Discriminant is positive ");
            double x1=((-b)-Math.sqrt(d)) / (2*a);
            double x2=((-b)+Math.sqrt(d)) / (2*a);
            System.out.println("X1 = " + x1 + ": X2 = "+x2);
        }
        else if(d==0)
        {
            System.out.println("Discriminant is 0");
            double x1 = -b/(2*a);
            System.out.println();

        }else
            System.out.println("Discriminant is negative, no roots");
    }

    public static int numberInPowerOfTwoTask3_4(int a){
        int reversed = reverseNumberTask3_1(a);
        System.out.println(a);
        while(reversed>=1)
        {
            int number = reversed%10;
            System.out.println(number +" - " + (number*number));
            reversed /=10;
        }
        return a*a;
    }


    public static int FactorialProgramTask3_5_01(int a){
        if(a<=1)
        {
            return 1;
        }
        else
        {
            int result=1;
            for (int i = 1;i<=a;i++ )
            {
                result=result*i;
                System.out.println(result);
            }
            return result;
        }
    }

    public static int FactorialProgramTask3_5_02(int a){

        if (a == 0)
            return 1;
        else
            return(a * FactorialProgramTask3_5_02(a-1));
    } // using recursion


    public static int numberOfDigitsCounterTask3_6(int a){
        System.out.println("You entered number : " + a);
        int count = 0;
        while(a>=1)
        {
            a/=10;
            count++;
        }
        System.out.println("Total number of Character is : " + count);
        return count;
    }

    public static void primeNumberFounderTask3_7(int number){
        int a = Math.abs(number);
        if(a==0||a==1)
        {
            System.out.println("This is not prime number");
        }
        else
        {
            int half = a/2;
            for (int i = 2; i <= half; i++)
            {
                if (a % i == 0)
                {
                    System.out.println(number + " - this is not Prime number");
                    return;
                }

            }
            System.out.println(number + "  - this is Prime number");
        }




    }


    public static void cubeJoiningCalculation(int numberOfCube){
        int matches = 0;
        if(numberOfCube==1&&numberOfCube>0)
        {
            matches =12;
        }
        else if(numberOfCube>1)
        {
            matches=12+(8*(numberOfCube-1));
        }
        System.out.println("For " + numberOfCube + " cubes we will use " +matches+ " matches ");

    }



}
