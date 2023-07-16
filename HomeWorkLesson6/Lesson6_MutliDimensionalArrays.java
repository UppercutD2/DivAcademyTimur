package HomeWork.DivAcademyTimur.HomeWorkLesson6;



import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson6_MutliDimensionalArrays {
    public static void main(String[] args) {

    }

    static void task5_1() {
//        Verilən 2 massivin cəmini hesablayan program yazın (daxil edilen her iki massivin size-ı eyni olmalıdır)
//        input --> massiv1-{2,5,6}
//                  massiv2-{4,7,1}
//        output--> cemMassivi-{6,12,7}
        Scanner input = new Scanner(System.in);

        System.out.println("Fill first array... ");
        int [] array1 = fillInArrayMethod(input);

        System.out.println("Fill second array...");
        int [] array2 = fillInArrayMethod(input);

        System.out.println( Arrays.toString(array1)+" - is First array");
        System.out.println(Arrays.toString(array2)+" - is Second array");

        sumOfNumbersInArrays(array1,array2);


    } //Sum of 2 Arrays
    static void task5_2(){
//        2.Verilən iki massivin beraber olub olmamasını yoxlayan program yazın(massivler eyni uzunluqlu olamlıdır)
//        1. input-> massiv1-{2,5,6} massiv2-{4,7,1}
//        output--> false
//        2.input-> massiv1-{2,5,6} massiv2-{2,5,6}
//        output--> true

        Scanner input = new Scanner(System.in);

        System.out.println("Fill first array... ");
        int [] array1 = fillInArrayMethod(input);

        System.out.println("Fill second array...");
        int [] array2 = fillInArrayMethod(input);

        boolean checkArrays = Arrays.equals(array1,array2)? true : false;

        System.out.println( Arrays.toString(array1)+" - is First array");
        System.out.println(Arrays.toString(array2)+" - is Second array");

        String result = checkArrays? "Arrays are same": "Arrays are not same";

        System.out.println(result);

    }//Compare to array for equality
    static void task5_3(){
//        3. Bir arrayin elementlərinin ədədi ortasını hesablayan program yazın
//        input- massiv-> {1,3,8}
//        output-> 4

        Scanner input = new Scanner(System.in);

        System.out.println("Fill array to find middle value");
        int [] array1 = fillInArrayMethod(input);
        double middleDouble= middleValueOfIntArray(array1);

        int middleInt = (int) middleDouble;
        System.out.println("\nMiddle value of array as Int is : " + middleInt );
        System.out.printf("Middle value of array as double is : %.2f\n",middleDouble);
    }//Find middle value of the array
    static void task5_4(){
//        4.Massivdəki en çox tekrar edilen elementi tapan program yazın
//        input-->massiv-> {2 ,5,7,5,8,3,2,6,2,4,2,1,3,2,2}
//        output-> 2

        Scanner input = new Scanner(System.in);

        System.out.println("Fill array to find middle value");
        int [] array1 = fillInArrayMethod(input);

        int maxFreq = mostRepetitiveValueinArray(array1);
        System.out.println("Max repetitive number is " + maxFreq);

    }//Find most repetitive value
    static void task5_5(){
//        5. Massivdəki sade və mürəkkəb ədədləri tapan program yazın və sadə ədələri yeni bir arraye mürekkeb ededleri ise basqa bir arraye doldurun (1 ne sade nede murekkeb ededdir)
//        input-massiv-{1,5,9,13,17,25,9}
//        output:
//        sade-{5,13,17}
//        murekkeb-{9,25,9}

        Scanner input = new Scanner(System.in);

        System.out.println("Fill array to find middle value");
        int [] array1 = fillInArrayMethod(input);
        System.out.println("You entered Array : " + Arrays.toString(array1));
        primeComplexNumbersSeparator(array1);


    }//That was interesting // prime an complex Numbers separator
    static void task5_6(){
//        6.iki eded ikiölçülü massiv yaradın və eyni indexdə olanların hasilinden ibaret yeni array yaradıb doldurun
//        input->
//                massiv1-{1,2,4        massiv-2-{2,5,6
//                        3,5,7}                 1,1,2}
//
//        output::{2,10,24
//            3,5,14}

        Scanner console = new Scanner(System.in);
        System.out.println("Filling FIRST ARRAY");
        int[][] array1 = fill2DimsnArray(console);
        System.out.println("Filling SECOND ARRAY");
        int[][] array2 = fill2DimsnArray(console);
        System.out.println("Array Number 1 ");
        print2DimArray(array1);
        System.out.println("Array number 2 ");
        print2DimArray(array2);
        int [][] result = multiplyTwoDimnArraysNumbers(array1,array2);
        System.out.println("Printing multiply result of the same index numbers");
        print2DimArray(result);

    }//Multiply same index numbers and resutling seperate array
    static void task5_7(){
//        7.Aşağıdakı şəkilləri çap edən program yazın:(ikiÖlçülü massiv istifade ederek)
//        1:
//           *
//           **
//           ***
//           ****
//           *****
//           ******
//                   2:
//                *
//               **
//              ***
//             ****
//            *****
//           ******


        Scanner console = new Scanner(System.in);

        int[][] array1 = create2DimnsArray(console);
        printLeftSideTriangle(array1);
        printRightSideTriangle(array1);


    }// Print Left sided and Right sided triangles based on 2 DIMENSIONAL arrays








    static int[][] create2DimnsArray(Scanner console){
        System.out.print("Enter number of Rows in Array : ");
        int row = console.nextInt();

        System.out.print("Enter number of Columns in Array : ");
        int column = console.nextInt();

        int[][] array = new int[row][column];
        return array;
    }

    static int[][] fill2DimsnArray(Scanner console) {
        System.out.print("Enter number of Rows in Array : ");
        int row = console.nextInt();

        System.out.print("Enter number of Columns in Array : ");
        int column = console.nextInt();

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.println( "Enter Value for Row : " + i +" | column " + j);
                array[i][j] = console.nextInt();
            }
            System.out.println();
        }
        return array;
    }//Filling 2 dimensional array;
    static void sumOfNumbersInArrays(int[] array1,int[] array2){
        int size = array1.length;
        int[] sumArray = new int[size];

        for(int i =0;i<size;i++){
            sumArray[i]=array1[i]+array2[i];
        }

        System.out.println(Arrays.toString(sumArray)+ " - is the sum of entered arrays");

    }
    static int[] fillInArrayMethod(Scanner console) {
        System.out.print("Enter size of array : ");
//        Scanner console = new Scanner(System.in);

        int size = console.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number with index :" + i);
            numbers[i] = console.nextInt();
        }

        return numbers;
    } //Method created to Fill array from Console Input / DRY concept used
    static double middleValueOfIntArray(int[] array){
        double value = 0;
        String info = " ";
        int sum=0;
        for(int i=0;i<array.length;i++){
            value+=array[i];
            sum+=array[i];
            if(i==array.length-1) {
                info += array[i] ;
            }
            else
            {
                info+=array[i]+ " + ";
            }
        }
        System.out.printf(info +" = %d",sum);
        value=value/(array.length);

        return value;
    }
    static int mostRepetitiveValueinArray(int[] array){
        int value = 0;
        int maxCount = 0;
        int maxFreq = 0;
        for(int i =0;i<array.length;i++)
        {
            int counter =0;
            for(int j=0;j<array.length;j++)
            {
                if(array[j]==array[i])
                {
                    counter++;
                }
                if(counter>maxCount){
                    maxCount=counter;
                    maxFreq=array[i];
                }
            }
        }

        System.out.println("Entered array is : " + Arrays.toString(array));

        return maxFreq;
    }
    static void primeComplexNumbersSeparator(int[] array){

        int countPrimes = 0;
        int countNumbers = 0;

        for( int i=0;i<array.length;i++)
        {
            if(array[i]==0||array[i]==1)
            continue;

            if(isPrimeNumber(array[i]))
            {
                countPrimes++;
            }
            else
            {
                countNumbers++;
            }
        }//Creating Length.values for 2 seperate arrays

        int[] primes = new int[countPrimes];
        int[] numbers = new int[countNumbers];
         countPrimes = 0;
         countNumbers = 0;
        for( int i=0;i<array.length;i++)
        {
            if(array[i]==0||array[i]==1)
                continue;

            if(isPrimeNumber(array[i]))
            {
                primes[countPrimes]=array[i];
                countPrimes++;
            }
            else
            {
                numbers[countNumbers] = array[i];
                countNumbers++;
            }
        }//filling primes and complex numbers

        System.out.println("Prime Numbers array : " + Arrays.toString(primes));
        System.out.println("Complex Numbers array : " + Arrays.toString(numbers));
    }
    static boolean isPrimeNumber(int a){
        if(a==0||a==1)
        return false;

        int n = a/2;
        for(int i = 2;i<=n;i++){
            if(a%i==0)
                return false;
        }
        return true;

    }
    static void print2DimArray(int [] [] array){
        int row = array.length;
        int column = array[0].length;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static int[][] multiplyTwoDimnArraysNumbers(int[][] array1,int[][] array2){
        int rows = array1.length;
        int columns = array1[0].length;
        int[][] result = new int[rows][columns];


        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                result[i][j]=array1[i][j]*array2[i][j];
            }

        }
     //   System.out.println(Arrays.deepToString(result);

        return result;
    }

    static void printLeftSideTriangle(int[][] array){
        int rows = array.length;
        int column = array[0].length;

        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printRightSideTriangle(int [][] array){
        int rows = array.length;
        int column = array[0].length;

        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {

                if(j+i>=rows-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
