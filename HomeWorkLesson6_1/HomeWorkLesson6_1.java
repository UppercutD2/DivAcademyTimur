package HomeWork.DivAcademyTimur.HomeWorkLesson6_1;


import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson6_1 {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,8,9,10,15,16,17};
        task6_5(array);
    }

    static double task6_1(Scanner console){
//        1. Simple Calculator programı yazın ilk öncə double tipində iki eded daxil olunacaq daha sonra isə emeliyyat üçün bir dəyişən yaradın
//        əgər 1-dirsə toplama , 2-dirsə çıxma , 3-dürsə vurma , 4-dürsə bölmə əməliyyatını etsin və nəticəni çap etsin;
//        input:
//        eded1=10;
//        eded2=5;
//        emeliyyat=4;
//        output:
//        2
//
//        input:
//        eded1=23;
//        eded2=7;
//        emeliyyat=1;
//        output:
//        30
//
//
//        input:
//        eded1=14;
//        eded2=2;
//        emeliyyat=2;
//        output:
//        12


        double result = 0;
        System.out.println("Enter First number : ");
        double first = console.nextDouble();
        System.out.println("Enter Second number : ");
        double second = console.nextDouble();

        console.nextLine();
        System.out.println("Enter operation to be performed : ( / , * , - , + ) ");

        String operation = console.nextLine();
        switch(operation){
            case "*":
                result = first*second;
                break;
            case "/":
                result = first/second;
                break;
            case "+":
                result = first/second;
                break;
            case "-":
                result = first-second;
                break;
            default:
                System.out.println("Entered Invalid operation...");
        }

        System.out.printf( "\n Result is : %.2f %s %.2f =  %.2f",first,operation,second,result);

        return result;
    }//Simple calculator with 3 inputs(2 numbers and 1 operation sign)

    static char[] task6_2(char[] array) {
//    2. Char arrayı yaradın və arrayı tərsdən çap edin ;
//    input :  charArr= {a,4,f,D,&,Z,g}
//    output:   {g, Z ,&, D,f,4,a}
        char[] reversed = new char[array.length];

        for(int i =0;i<array.length;i++){
            reversed[i]=array[array.length-1-i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversed));

        return reversed;





    }//Reverses inputted array of chars

    static void task6_3(int[] array){
//        3.Arrayın elementlərini foreach istifadə edərək çap edin
//        input->{1,3,4,8,9}
//        output-> 1 3 4 8 9
        for(int i:array){

            System.out.println(i);
        }
    }//sout each element of array

    static void task6_4(int[] array){
//        4.Arraydə bütün mənfi ededleri müsbətə çevirib daha sonra çap edən  program yazın edin:
//        input-> {-1,3,-5,14,0,-7}
//        output-> 1 3 5 14 0 7


        for(int i : array){
            if (i<0){
                i=Math.abs(i);
            }
            System.out.println(i);
        }
    }//converts negative numbers to positive and prints all numbers

    static void task6_5(int [] array){
//        5. Arraydə itmiş ededi tapın. Arrayde ededler artan sırada düzülür meselen {1,2,3,4,5,7} burada yazılmayan ededi tapan program yazın meselen burada 6 yazılmayıb (yazılan program bütün artan sıralı array üçün nezerde tutulsun və bütün ededler 1 vahid artır , birdə arrayın ilk ədədi itmiş eded olmamalıdır  )
//        input-> {12,13,15,16,17,18}
//        output-> 14
            int start = array[0];
        System.out.println(Arrays.toString(array));
        for (int i=0;i<array.length;i++){
            while(array[i]!=start){
                System.out.print("Missed number is : "+ start);
                System.out.println();
                start++;
            }

            start++;
        }
    }//Finder of lost number in Array order

    static void task6_6(int[] array){
//        6.Arraydə ikinci ən böyük elementi tapan program yazın
//        input-> {2,45,12,78,23,44,56,187,134}
//        output-> 134

        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
}
