package HomeWork.DivAcademyTimur.HomeWorkLesson7_SpecialEdition;


import HomeWork.DivAcademyTimur.HomeWorkLesson6_2.HomeWorkTask_7;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWorkTask_8 {
    static final String username = "Admin";
    static final String password = "admin@123";
    static final String validUser = "Welcome, dear " + username;
    static final String invalidUser = "User doesn't exist :  ";

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

//        Task8_1(console);
//        Task8_2(console);
//        Task8_3(console);
//        Task8_4(console);
//        Task8_5(console);
//        Task8_6(console);
//        Task8_7(console);
//        Task8_8(console);
//        Task8_9(console);
//        Task8_10();
//        Task8_11(console);
//        Task8_12(console);
//        Task8_13(console);
//        Task8_14(console);
//        Task8_15(console);
//        Task8_16(console);
        //ALL Tasks have their description during run time also in code section. Advisable to remove comment 1 by 1 and run them.
        //SPECIAL NOTE: i Hope you will like MY interpretation of Task8_6.

    }


    static int[][] multiDmnsArrayFiller(Scanner console)
    {
        System.out.print("Enter number of rows for 2 sized massive: ");
        int rows = console.nextInt();
        System.out.println("Enter number of columns for 2 sized massive: ");
        int columns = console.nextInt();

        int[][] numberArray = new int[rows][columns];

        for(int i =0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.printf("Enter number for %d : %d position  (row : column) ",i,j);
                numberArray[i][j] = console.nextInt();
            }
        } //Filling 2 dimensional array

        return numberArray;
    }// Method to fill multidimensional array from user input. DRY
    static int[] leftDiagonalFinder(int[][] array)
    {
        int row = array.length;
        int column = array[0].length;


        int[] leftDiagonal = new int[array[0].length];
        for(int r=0;r<row;r++)
        {
            for(int c =0;c<column;c++)
            {
                if(r==c)
                    leftDiagonal[r]=array[r][c];
            }
        }


        return leftDiagonal;
    }//Finder of left diagonal data from multidimensional array.  !!! SPECIAL NOTE:  Rows and Arrays should be equal to have proper results. !!!
    static int[] rightDiagonalFinder(int[][] array)
    {
        int row = array.length;
        int column = array[0].length;

        int[] rightDiagonal = new int[array[0].length];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (r + c == row - 1)
                    rightDiagonal[r] = array[r][c];
            }


        }
        return rightDiagonal;
    }//Finder of right diagonal data from multidimensional array.  !!! SPECIAL NOTE:  Rows and Arrays should be equal to have proper results. !!!
    static void printerDataByRows(int[][] numberArray)
    {
        for(int i =0;i<numberArray[0].length;i++)
        {
            System.out.println(Arrays.toString(numberArray[i]));
        } //Printing by rows
    }//Printer of data row by row in 2-dimensional array


    static void Task8_1(Scanner console)
    {
        System.out.println("Task to print 2 dimensinonal Array by rows (Task8_1)");
//        1.	N sətir və m sütundan ibarət iki ölçülü massiv yaradın. Bunları console’dan doldurun və çap edin.
//            Input:
//        Column: 3
//        Row: 2
//        1 2 3
//        4 5 6
//
//        Output:
//        1 2 3
//        4 5 6

        int[][] numberArray = multiDmnsArrayFiller(console);
        System.out.println("Two dimensional massive is as below ");
//        System.out.println(Arrays.deepToString(numberArray));
        int rows = numberArray.length;
        for(int i =0;i<rows;i++)
        {
            System.out.println(Arrays.toString(numberArray[i]));
        } //Printing by rows


    }//Fill and print two dimensional Massive

    static void Task8_2(Scanner console)
    {System.out.println("Task to print sum of numbers in rows (Task8_2)");
//        2.	N sətir və m sütundan ibarət iki ölçülü massiv yaradın. Bunları console’dan doldurun və daha sonra hər bir sətirin cəmini ayrı-ayrılığda çap edin.
//        Input:
//        Column: 3
//        Row: 2
//        1 2 3
//        4 5 6
//
//        Output:
//        6
//        15

        int[][] numberArray = multiDmnsArrayFiller(console);
        int rows = numberArray.length;
        int column = numberArray[0].length;


        for(int i=0;i<rows;i++)
        {   int sum=0;
            for(int j=0;j<column;j++)
            {
                sum+=numberArray[i][j];



            }
            System.out.println(sum);
        }


    }//Fill and print sum of numbers in single row.

    static void Task8_3(Scanner console)
    {System.out.println("Printer of Left and Right Diagonals in 2 dimensional arrays (Task8_3)");
//        3.	N sətir və n sütundan ibarət iki ölçülü kvadrat massiv yaradın. Bunları console’dan doldurun və sadəcə sağ və sol diaqonalı çap edin.
//        Input:
//        N: 3
//        1 2 3
//        4 5 6
//        7 8 9
//
//        Output:
//        Major (Left) diagonal: 1 5 9
//        Minor (Right) diagonal: 3 5 7


        int[][] numberArray = multiDmnsArrayFiller(console);
        int[] leftDiagonal = leftDiagonalFinder(numberArray);
        int[] rightDiagonal = rightDiagonalFinder(numberArray);
        for(int i =0;i<numberArray[0].length;i++)
        {
            System.out.println(Arrays.toString(numberArray[i]));
        } //Printing by rows
        System.out.println("Left diagonal is : " + Arrays.toString(leftDiagonal));
        System.out.println("Right diagonal is : " + Arrays.toString(rightDiagonal));
    }//Printer of right and left diagonal from proportional 2 Dimensional Array
    static void Task8_4(Scanner console)
    {System.out.println("Creator of reversed array (Task8_4)");
//        4.	N sətir və n sütundan ibarət iki ölçülü kvadrat massiv yaradın. Bunları console’dan doldurun və daha sonra
//        sol diaqonalı tərsinə çevirərək çap edin (aşağıdakı qayda da).
//            Input:
//        N: 3
//        1 2 3
//        4 5 6
//        7 8 9
//
//        Output:
//        9 2 3
//        4 5 6
//        7 8 1
        int[][] numberArray = multiDmnsArrayFiller(console);

        int row = numberArray.length;
        int column = numberArray[0].length;
        int [][] reversedArray= new int[row][column];

        for(int r=0;r<row;r++)
        {
            for(int c=0;c<column;c++)
            {
               reversedArray[r][c]= numberArray[row-1-r][column-1-c];
            }
        }//cycle for filling array in reverse;
        System.out.println("Original Array :");
        printerDataByRows(numberArray);
        numberArray=null;
        System.out.println("Reversed Array :");
        printerDataByRows(reversedArray);

    }//reverse array Creator
    static void Task8_5(Scanner console)
    {System.out.println("Right Diagonal reverser (Task8_5)");
//        5.	N sətir və n sütundan ibarət iki ölçülü kvadrat massiv yaradın. Bunları console’dan doldurun və daha sonra sağ diaqonalı tərsinə çevirərək çap edin (aşağıdakı qayda da).
//            Input:
//        N: 3
//        1 2 3
//        4 5 6
//        7 8 9
//
//        Output:
//        1 2 7
//        4 5 6
//        3 8 9
        int[][] originalArray = multiDmnsArrayFiller(console);
        System.out.println("Original Array");
        printerDataByRows(originalArray);

        for(int i=0;i< originalArray.length/2;i++)
        {int temp=0;
            for(int j=0;j< originalArray[0].length;j++)
            {
                if(i+j==originalArray.length-1) {
                    temp = originalArray[i][j];
                    originalArray[i][j] = originalArray[j][i];
                    originalArray[j][i] = temp;
                }
            }
        }
        System.out.println("Right Diagonal Reversed Array");
        printerDataByRows(originalArray);

    }//Right Diagonal Reverser
    static void Task8_6(Scanner console)
    {System.out.println("Multiple shapes drawing based on input (Task8_6)");
/////////////////////////////////////////////////////////////////////////////////////
        //Draw required figure Output:
        //a.
        //*
        //**
        //***
        System.out.println("Enter number for left sided triangle size : ");
        int size = console.nextInt();
        for(int i=0;i<size;i++){
            int index =0;
            while(index<=i)
            {
                System.out.print("*");
                index++;
            }
            System.out.println();
        }//Left sided triangle printer



/////////////////////////////////////////////////////////////////////////////////////
//        b.***
//           **
//            *
        System.out.println("Enter number for Right Sided Reversed Triangle");
        size= console.nextInt();

        for(int i =0;i<size;i++)
        {
            int index =0;
            while(index<i)
            {
                System.out.print(" ");
                index++;
            }

            while(index<size)
            {
                System.out.print("*");
                index++;
            }
            System.out.println();

        }//reversed upside down Triangle
/////////////////////////////////////////////////////////////////////////////////////
//        c.  *
//           **
//          ***
        System.out.println("Enter Size for Right sided Triangle : ");
         size= console.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(j+i>=size-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }//Right sided normal Triangle
/////////////////////////////////////////////////////////////////////////////////////
//        d. ***
//           **
//           *
        System.out.println("Enter Size for Left side Reversed Triangle");
         size = console.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(i+j<=size-1?"*":" ");
            }
            System.out.println();
        }//Left Side Reversed Triangle

/////////////////////////////////////////////////////////////////////////////////////
//        e.    *
//            * *
//          * * *
//
        System.out.println("Enter size of the Left Triangle with Spaces");
         size = console.nextInt();

        for(int i =0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i+j>=size-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }//Right Triangle With spaces
////////////////////////////////////////////////////////////////////////////////
//        f. * * *
//           *   *
//           * * *
        System.out.println("Enter size of the Empty Square");
        size = console.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==0 || i==size-1){
                    System.out.print("* ");
                }
                else if(j==0 ||j==size-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }//Empty Square Algorithm drawer
////////////////////////////////////////////////////////////////

//        g.
//        1
//        22
//        333


        System.out.println("Enter number of left Triangle based on Row number");
        int row=console.nextInt();
        for(int i=0;i<row;i++)
        {   int index=0;
            while(index<i+1)
            {
                System.out.print(i+1);
                index++;
            }
            System.out.println();
        }//Left Triangle based on Row number
////////////////////////////////////////////////////////////////////

//        h.
//        1
//        23
//        456

        System.out.println("Enter number of Rows to print Increasing sequence Triangle : ");
        size= console.nextInt();
        int index=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {   index++;
                System.out.print(index+ " ");

            }
            System.out.println();
        }//Sequence of number in Triangle printer



    }//Multiple shapes drawing algorithms

    static void Task8_7(Scanner console)
    {System.out.println("Finding sum of number in String with Power of 2 (Task8_7)");
//        7.	Aşağıda verilmiş sətirin içərisindəki ədədlərin kvadratları cəmini tapın.

        System.out.println("Enter String to Calculate of numbers in power of 2");
        String str = console.nextLine();
        System.out.println("Original String : " +str );
        int[] numbers = new int[str.length()];

        char[] chars = str.toCharArray();
        int index=0;
        for(char c : chars)
        {
            boolean isNumber = NumberStipperoutOfString.isNumber(c);
            if(isNumber)
            {
                numbers[index]=Integer.parseInt(String.valueOf(c));
                index++;
            }
        } //Adding numbers to array numbers
        numbers=Arrays.copyOfRange(numbers,0,index);
        System.out.println(Arrays.toString(numbers));
        int sum=0;
        for(int i: numbers)
        {
            sum=sum+(i*i);
        }//Finding sum of Power 2.numbers

        System.out.println(sum);

    }//Finding sum of numbers in String with Power of 2
    static void Task8_8(Scanner console)
    {System.out.println("Prints number of usage of each character overall(Task8_8)");

//        8.	Daxil olunmuş sətirdə hansı simvoldan neçə dəfə istifadə olunduğunu tapan proqram yazın. Və hərf həssasiyyəti olmasın. Yəni, böyük A-da kiçik a-da eyni simvolu ifadə etsin. ( Bu biraz çətindir, amma, yazmağa cəhd edin. “Bura qədər yazdım, ama bu səhvi alıram, necə düzəldim?” – sualını eşitmək istəyirəm)
//
//        Input: Hello WorLd
//        Output:
//        h – 1
//        e – 1
//        l – 3
//        o – 2
//        w – 1
//        r – 1
//        d – 1

        System.out.println("Enter String to Find how Many times each Character used :");

        String original = console.nextLine();//original String
        char[] caseSensitive = original.toCharArray();
        char[] uniqueCaseSensitive = removeDuplicateFromCharArray(caseSensitive);



        String lowerCaseOrg = original.toLowerCase();//LowerCase String
        char[] orgChars= lowerCaseOrg.toCharArray();



        char[] uniqueCh = removeDuplicateFromCharArray(orgChars);

        System.out.println("Unique characters in String " + Arrays.toString(uniqueCh));


        for (int i=0;i<uniqueCh.length;i++)
        {

            char check=uniqueCh[i];
            int count=0;
            for(int j=0;j<lowerCaseOrg.length();j++)
            {
                if(check==lowerCaseOrg.charAt(j))
                    count++;
            }



            System.out.println(uniqueCh[i] + " - " + count);

        }


    }//Printer of unique character usage in String
    public static char[] removeDuplicateFromCharArray(char[] array)
    {
        char[] orignal = Arrays.copyOf(array,array.length);
        char[] uniqueCh=new char[array.length];
        String checker = "";
        int index=0;
        for(int i=0;i<array.length;i++)
        {   char c= orignal[i];
            for(int j=0;j< array.length;j++)
            {
              checker=Arrays.toString(uniqueCh);
               if(!checker.contains(String.valueOf(c)))
               {
                   uniqueCh[index]=c;
                   index++;
               }

            }
        }
        uniqueCh=Arrays.copyOfRange(uniqueCh,0,index);

        return uniqueCh;
    }//Creator of Unique Character values in String (METHOD)
    static void Task8_9(Scanner console)
    {System.out.println("Palindrome Checker (Task8_9)");
        HomeWorkTask_7.Task7_5(console);
    }//Ready solution from previous Lesson 7, Task 5
    static void Task8_10()
    {System.out.println("Simple operation of String.replace method(Task8_10)");

//        10.	 Aşağıda verilmiş sətirdə hər bir rəqəm arasında olan vergülü, vergül boşluğa dəyişin. Yəni -> “1, 2, 3, 4, 5, 6, 7, 8, 9” – çap olunsun.
//        String str = “1,2,3,4,5,6,7,8,9”;
//        Output: 1, 2, 3, 4, 5, 6, 7, 8, 9
        String str = "1,2,3,4,5,6,7,8,9";
        System.out.println(str);
        str=str.replace(",",", ");
        System.out.println(str);


    }//Replace (,) with (, )
    static void Task8_11(Scanner console)
    {System.out.println("Decimal to Binary converter (Task8_11)");
//        11.	10-luq say sisteminde daxil edilmiş ədədi 2-lik say sisteminə çevirən proqram yazın.
//            Input: 8
//        Output: 1000

        System.out.println("Enter Decimal number to convert into BinaryNumber: ");
        int decimal = console.nextInt();
        String reversedBinary="";
        String quickBinary = Integer.toBinaryString(decimal);//used to check Timurs algorithm for correct answer

        System.out.println("ToBinaryString method result : "+quickBinary);

        while(decimal/2>=1) {
            if (decimal % 2 == 1) {
                reversedBinary += 1;
                decimal /= 2;
            } else {
                reversedBinary += 0;
                decimal /= 2;
            }


        }//main binary calculations cycle

        reversedBinary = decimal == 1 ? reversedBinary + 1 : reversedBinary + 0;//Final bit resulter
        String niceViewReversed="";
            String binaryNumber ="";

        for (int i=0;i<reversedBinary.length();i++)
        {
            if(i%4==0)
                niceViewReversed+=" ";

            niceViewReversed+=String.valueOf(reversedBinary.charAt(i));
        }//adding space each for bits
            reversedBinary=niceViewReversed;

            System.out.println("Reversed Binary :" +reversedBinary);
            for (int i=0;i<reversedBinary.length();i++)
            {

                binaryNumber+=String.valueOf(reversedBinary.charAt(reversedBinary.length()-1-i));

            }//Reversing result to get correct Binary String answer
            System.out.println("Timurs Algorithm : "+binaryNumber);




    }//Converter from Decimal to Binary number (with spaces)
    static void Task8_12(Scanner console)
    {System.out.println("Quick filler and checker of Database by Substring finder (Task8_2)");
//        12.		Kiçik bir axtarış sistemi quracayıq. String tipində olan massivdə bir çox adlar yer alsın. Və daha sonra console`da bizdən input istənilsin. Məsələn:
//    String[] users = {“Abbas”, “Ləman”, “Xədicə”, “Ilyas”, “Nurlan”, “Nihat”, “Elçin”, “Eldar”, “Mirhəsən”, “Emin”, “Təranə”}; - belə bir massivimiz var.
//            Mən console-da ‘abb’ – daxil ederkən proqram anlasın ki, mən Abbası axtarıram. Və həmin adı tamamlayaraq yanında index-i olmağla çap etsin. Yox əgər, uyğun gələn bir çox ad varsa hamısını çap etsin. Əks halda isə belə bir user yoxdur desin.
//        Input: an
//
//        Output:
//        Ləman – 1
//        Nurlan – 4
//        Təranə - 10


        System.out.println("Enter numbers of Names to be inputted : ");
        int size = console.nextInt();

        String[] names = new String[size];
        int position=0;

        console.nextLine();
        for(int i=0;i<size;i++){
            position++;
            System.out.println("Enter name to be inputed for position - " +position);
            String name =console.nextLine();
            names[i]=name;

        }//Filling array with names



        System.out.println("Filling stoped");
        String[] namesLowerCase = new String[size];

        for (int i=0;i<size;i++)
        {
            namesLowerCase[i]=names[i].toLowerCase();

        }//Creating names array to lower case to make search easier

        System.out.println("Enter name to search in Data Base :");
        String search = console.nextLine();

        for(int i=0;i<namesLowerCase.length;i++)
        {
            if(namesLowerCase[i].contains(search)){
                System.out.println("Name : "+names[i] + " | index :  "+i);
            }
        }

    }//Filling array with names and Search by contains methods with position details printing
    static void Task8_13(Scanner console)
    {System.out.println("Login and Password system CHECKER. (ALREADYinputted as Static values in class) (Task8_13)");
//        13.		Login (giriş) proqramı tərtib edin. (Proqramın içində düzgün dəyərləri static(əvvəldən, dəyişməz şəkildə) olarağ təyin edin.) Daha sonra proqram run olduğda bizdən 2 input istənilir, username və password.
//        Əgər daxil etdiyimiz username səhvdirsə -  User doesn’t exist: username – çap olunsun, altından xətt çəkdiyim hissə, istifadəçinin daxil etdiyi username olmalıdır. Səhv yazma limiti yoxdur.
//        Şifrəni səhv yazdığda – İncorrect password\n Left attempt: x – çap olunsun(x – qalan cəhdlərin sayı). Və əgər şifrəni 3-cü dəfə yanlış daxil edərsə - Access denied – çap olunsun və proqram sonlansın.
//            Əks halda hər biri doğrudursa - “Welcome, dear ‘username’!” – deyə çap etsin.
        int attempt=3;
        while(attempt>0) {
            System.out.print("Username : ");
            String usrnm = console.nextLine();

            System.out.print("Password : ");
            String psw = console.nextLine();
            System.out.println();
            usrnm = usrnm.trim();
            boolean usrnCheck = usrnm.equalsIgnoreCase(username);
            boolean  pswCheck = psw.equals(password);
            if (usrnCheck && pswCheck)
            {
                System.out.println(validUser);
                break;

            }//username and psw valid. good to go
            else if (!usrnCheck)
            {
                System.out.println(invalidUser + usrnm);
                System.out.println();

            }//Only username mismatch.Unlimited Tries

            if( !pswCheck)
            {


                attempt--;
                System.out.println("Incorrect password. " + attempt + " attempts left");
                System.out.println();

            } //Password checker
            if(attempt==0){
                System.out.println("Access Denied");
                break;
            }//3 attempt out message and breaking the loop.





        }   //Username  & pssword checker loop
    }//username Password login system
    static void Task8_14(Scanner console)
    {System.out.println("Sorting Array (Task8_14)");
//        14.	Daxil edilmiş n ölçülü massivi sıralı şəkildə çap edin.
//            Input:
//        n: 5
//        9 0 6 -3 1
//
//        Output:
//        -3 0 1 6 9
            int[ ] array = fillInSingleArray(console);
        System.out.println("Original Array "+Arrays.toString(array));
            Arrays.sort(array);
        System.out.println("Sorted Array"+Arrays.toString(array));

    }//Sorting array

    static int[] fillInSingleArray(Scanner console)
    {
        System.out.println("Enter size of the massive: ");
        int size = console.nextInt();
        int[] array = new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter value to index - " +i);
            array[i]=console.nextInt();
        }

        return  array;
    }//Filler of Single Int array
    static void Task8_15(Scanner console)
    {System.out.println("Vowel and Consonants counter(Task8_15)");
//        15.	Daxil edilmiş sətirdə sait və samitlərin sayını çap edən proqram tərtib edin.
//        İnput: java developer
//        Output:
//        Vowel(sait): 6
//        Consonant(samit): 7
        System.out.println("Enter String to Calculate total number of ( Vowel) and (Consonant)");
        String original = console.nextLine();
        String lowerCase = original.toLowerCase();
        int vowel = 0;
        int consonant =0;

        for(int i=0;i<lowerCase.length();i++)
        {
            char ch= lowerCase.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowel++;
            }
            else if(ch>='a'&& ch<='z')
            {
                consonant++;
            }
        }
        System.out.println("Total vowels - " +vowel);
        System.out.println("Total consotant - " + consonant);


    }//Vowel and Consonant counter

    static void Task8_16(Scanner console)
    {System.out.println("Anagram checker (Task8_16)");
//        16.Daxil olunmuş iki stringin anagram olub olmadığını tapan program yazın.(anagram sözlər eyni uzunluqda və eyni herfleri saxlayan sözlərə deyilir meselen Mary və Army anagram sözlərdir.  Uzunluqları eynidir və herfler eynidir her iki söz ‘A’ ,’M’ , ‘R’, ‘Y’ simvollarından yaranmışdır
//
//        İnput : ARMY        Mary
//
//        output:This two strings are anagram
//        İnput :   Madam            madan
//
//        output:This two strings are NOT  anagram
        System.out.println("Enter two words to check if they are Anagram or not ");
        System.out.print("Word N1 : ");
        String word1 = console.nextLine();
        word1=word1.trim();

        System.out.print("Word N2 : ");
        String word2 = console.nextLine();
        word2=word2.trim();

        String lowerWord1 = word1.toLowerCase();
        String lowerWord2 = word2.toLowerCase();

        char[] ch1 = lowerWord1.toCharArray();
        char[] ch2 = lowerWord2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2)? "Words are Anagrams" : "Words are not Anagrams");

    }//Anagram checker

}
