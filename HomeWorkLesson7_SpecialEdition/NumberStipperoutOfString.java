package HomeWork.DivAcademyTimur.HomeWorkLesson7_SpecialEdition;

import java.util.Arrays;
import java.util.Scanner;

public class NumberStipperoutOfString {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        completeEditionTaskFromElcan(console);
    }

    //P.S Elcan that was very interesting task. Program still can be improved by considering Double and Float numbers.
    // but it can cause misunderstading. Is that really Double number or just Sentence ended with number and Started with number)
    //Example with double:           its price is 9.99 (9.99 is double datatype)
    //Example with Misunderstanding: its price is 3.5 percent will be discount. can be managed. but will take time, to take into account all conditions.


    static void completeEditionTaskFromElcan(Scanner console)
    {
        System.out.println("Please Enter the String to seperate numbers from it:");

        String originalstr = console.nextLine();//getting original String from user

        char[] origchars = originalstr.toCharArray();//breaking everyting to Signle char value
        String[] numberWithIndex = numberCombiner(origchars);//seperating numbers and its index sequence in original String
        System.out.println("This is all numbers in String with indexes ( Number - Index)   " + Arrays.toString(numberWithIndex));

        int[] onlyNumbers = getterOfNumbersFromString(numberWithIndex);//combining numbers according to its Index Sequence and letters between.
        System.out.println("This is seperated numbers in Arrays of Int[] data type   "+Arrays.toString(onlyNumbers));

        System.out.println("THE END!!!");

    }//All features combined into 1 method to have only user input parametr.
    static boolean isNumber(char c)//Check character for being a digit
    {
        String s = String.valueOf(c);
        try
        {
            Integer.parseInt(s);
            return true;
        }catch(Exception e)
        {
            return false;
        }

    }

    static String[]  numberCombiner(char[] array)//Extracts numbers with its indexes from char array
    {

        String[] numberArray= new String[array.length];
        int index=0;
        for (int i=0;i<array.length;i++)
        {
            if(isNumber(array[i])){
                String s=String.valueOf(array[i]);
                numberArray[index]=s+"-"+i;
                index++;
            }
        }
        String[] numberArray2 = Arrays.copyOfRange(numberArray,0,index);
        numberArray=null;

        return numberArray2;
    }

    static int[] getterOfNumbersFromString(String[] array)
    {
        int[] numbers = new int[array.length];
        String combined="";
        int index=0;

        for(int i=0;i<array.length-1;i++)
        {
            boolean concatable = false;


            while(i != array.length - 1)
            {
                concatable = indfinder(array[i + 1]) - indfinder(array[i]) == 1 ? true : false;
                if (concatable)
                {
                    combined += numberExtractor(array[i]);
                    i++;
                }
                else
                {
                    combined += numberExtractor(array[i]);
                    numbers[index] = Integer.parseInt(combined);
                    combined = "";
                    index++;
                    i++;
                }
            }//cycle for speeding up reaching last index with combine condition
            i=array.length-1;

//** Starting separate condition for combining with last or not

            int last = indfinder(array[i]);
            int prelast = indfinder(array[i-1]);

            concatable=last-prelast==1?true:false;

            if (concatable && i==array.length-1)
            {

                combined += numberExtractor(array[i]);
                numbers[index] = Integer.parseInt(combined);
                combined="";
                break;
            }
            else
            {
                if(combined.isEmpty()) {
                    combined+=numberExtractor(array[i]);
                    numbers[index] = Integer.parseInt(combined);

                    break;
                }
                else
                {
                    numbers[index]=Integer.parseInt(combined);
                    combined="";
                    index++;
                    combined+=numberExtractor(array[i]);
                    numbers[index]=Integer.parseInt(combined);
                    break;
                }

            }//I hope you like Italian Food. because that is Spaghetti code))))

        }

        int [] finalResult = Arrays.copyOfRange(numbers,0,index+1);



        return finalResult;
    } // MAIN combine engine. ***   I hope you like Italian Kitchen )))) Spaghetti code is waiting for you.

    static int indfinder(String s)//Extracts index  of number is Original String
    {
        int index=Integer.parseInt(s.substring(2));

        return index;
    }
    static int numberExtractor(String s)//extracts number from original String
    {

        int number=Integer.parseInt(String.valueOf(s.charAt(0)));
        return number;
    }
}
