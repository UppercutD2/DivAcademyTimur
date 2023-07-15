package Lesson5.HomeWork_L5;


import java.util.Arrays;
import java.util.Scanner;

public class Lesson5_Arrays {
    public static void main(String[] args) {



    }


    static void Task5_1(){
//        Massivdəki cüt elementlərin cəmini hesablayan program yazın.
//                massiv input ---> {1 ,4,14,17,20,40,9,17,45}
//        output:78

        Scanner console = new Scanner(System.in);
        int[] numbers = fillInArrayMethod(console);
        System.out.println("Calculating sum of ODD numbers in Array\n");
        int sum = oddNumberSumInArrayMethod(numbers);
        console.close();
    }
    static void Task5_2(){
//        Daxil edilen massivi tərsinə çevirib yeni arraya dolduran program yazın
//        input massiv---> {1,4,8,2,19,3}
//        output- {3,19,2,8,4,1}

        Scanner console = new Scanner(System.in);
        int[] numbers = fillInArrayMethod(console);
        int[] reversedArray = reverseArrayMethod(numbers);
        console.close();
    }
    static void Task5_3() {
//        daxil olunmuş Massivdəki elementləri artan sıra ilə  çap edən program yazın(sorting algoritmlərini araşdırın)
//        input massiv --->{3,17,1,67,13,5}
//        output: {1,3,5,13,17,67}

        Scanner console = new Scanner(System.in);
        int[]numbers = fillInArrayMethod(console);
        int[] sortedArr = sortArrayMethod(numbers);
        console.close();

    }

    static int oddNumberSumInArrayMethod(int[]numbers){
        int sum = 0;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2==0)
            {
                int position = i;


                if(sum==0) {
                    System.out.printf("Number: %d  with index : %d, is ODD, Sum : %1$d\n", numbers[i], position);
                    sum+=numbers[i];
                }
                else
                {
                    System.out.printf("Number: %1$d  with index : %2$d, is ODD, Sum : %3$d + %1$d = "+(numbers[i]+sum)+"\n", numbers[i], position, sum);
                    sum+=numbers[i];
                }
            }
        }


        return sum;
    } // method for specific task
    static int[] fillInArrayMethod(Scanner console) {
        System.out.print("Enter total count of numbers to be input : ");
//        Scanner console = new Scanner(System.in);

        int size = console.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number with index :" + i);
            numbers[i] = console.nextInt();
        }
        console.close();
        System.out.println("You entered : " + Arrays.toString(numbers));
        return numbers;
    } //Method created to Fill array from Console Input / DRY concept used
    static int[]  sortArrayMethod(int[] numbers){
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i; j < numbers.length; j++)
            {
                if (numbers[j] < numbers[i])
                {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.println("Sorted Array is :" + Arrays.toString(numbers));
        return numbers;
    } //  method for sorting

    static int[] reverseArrayMethod(int[]numbers){
        int size = numbers.length;
        int[]reversedArray=new int[size];
        for (int i=0;i<size;i++)
        {
            reversedArray[size-1-i]=numbers[i];
        }
        System.out.println("Reversed array is : " + Arrays.toString(reversedArray));
            return reversedArray;
    } //method for reversing
}
