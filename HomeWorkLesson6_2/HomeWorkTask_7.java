package HomeWork.DivAcademyTimur.HomeWorkLesson6_2;


import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTask_7 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);




    }

    static void Task7_1(Scanner console){
//        1. Daxil olunmuş cümlədəki bütün sözləri ayrı-ayrılıqda çap edən program yazın
//        input-> Salam java bir programlaşdırma dilidir
//        output-> Salam
//        java
//                bir
//        programlaşdırma
//                dilidir
        System.out.println("Task 7_1");
        System.out.println("Enter String to print every words from ne Line :");
        String s = console.nextLine();
        String[] words = s.split(" ");
        System.out.println("Original String: " + s);
        for(String str: words){
            System.out.println(str);
        }
    }//Printer of words with new Line


    static void Task7_2(Scanner console){
//        2. Daxil olunmuş iki stringin beraberliyini yoxlayan program yazın.(böyük kiçik herfler nezere alınmasın)
//        input-> salam
//        saLaM
//
//        output-> daxil olunmuş sözler beraberdir
//
//
//        input-> java
//        avaja
//
//        output-> daxil olunmuş sözlər bərabər deyil
        System.out.println("Task 7_2");
        System.out.print("Enter First String : ");
        String s1 = console.nextLine();
        System.out.println();

        System.out.print("Enter Second String : ");
        String s2 = console.nextLine();
        System.out.println();


        boolean equal = s1.equalsIgnoreCase(s2)?true:false;

        if(equal)
        {
            System.out.println(" Strings are Equal ,Ignoring case");
        }
        else
        {
            System.out.println("Strings are not Equal");
        }
    }//EqualsIgnoreCase - String comparator

    static void Task7_3(Scanner console){
//        3.Daxil olunmuş cümlədəki bütün simvolların sayını tapan program yazın.(space(boşluq) nezere alınmasın)
//
//        input->      Hello World!!
//
//                output-> 12
        System.out.println("Task 7_3");
        System.out.println("Enter String to calculate total number of characters: ");
        char[] charArray = console.nextLine().toCharArray();
        int counter=0;
        for(char c :charArray){
            if(c!=32){
                counter++;
            }
        }
        System.out.println("Total number of characters in String is : " + counter);





    }//Counter of characters !=(Space character)

    static void Task7_4(Scanner console){
//        4.Daxil olunmuş iki  sözü  birləşdirən java programı yazın(String methodları ile)
//
//        input->String1- Hello
//        String2- World!
//                output-> Hello World!

        System.out.println("Task 7_4");
        System.out.print("Enter First String : ");
        String s1 = console.nextLine();
        System.out.println();

        System.out.print("Enter Second String : ");
        String s2 = console.nextLine();
        System.out.println();

        String result  = String.join(" ",s1,s2);

        System.out.println("Combined result is: " + result);

    }//String.join with delimeter

     public static void Task7_5(Scanner console){

//        5.Sözün palindrom olub olmadıgını tapan program yazın
//
//        input-> madam
//        output-> bu söz palindromdur
//
//        input-> great
//        output-> bu söz palindrom DEYİLDİR

        System.out.println("Task 7_5");
       while(true) {

           System.out.println("\n \n Enter word to check if it is Palindrome,\n " +
                   "Type \"Exit\" to stop the program\n ");
           String s =console.nextLine();
           if(s.equalsIgnoreCase("Exit"))
            break;


            String caseEqualizer= s.toLowerCase();
           char[] charArray = caseEqualizer.toCharArray();
           int length = charArray.length;

           boolean palindrome = true;

           if(length==0 ||s.isEmpty()||s.isBlank())
               palindrome=false;



           for (int i = 0; i < length; i++) {
               char start = charArray[i];
               char end = charArray[length - 1 - i];
               if (start != end) {
                   palindrome = false;
                   break;
               }
           }

           String result = palindrome ?s +  " --  is Palindrome " :s + " -- is not Palindrome";
           System.out.print(result);
       }//Cycle created for multiple attempts till("Exit" - inputed)
        System.out.println("\nProgramm stopped");
    }//Palindrome checker .. Character case sensitivity will not affect Palindrome check

    static void Task7_6(Scanner console) {
//    6.Daxil olunmuş stringdə ən çox təkrarlanan simvolu gösteren program yazın
//
//    input->Saalam Dünya
//
//    output-> a
//
//    input-> why  iii string is immutable?i?
//
//    output-> i
        System.out.println("Task 7_6");
        System.out.println("Enter String to find max Repeated character : ");
    String s =console.nextLine();
    char[] charArray = s.toCharArray();

    int maxCount=0;
    int counter=0;
    char maxRep='c';
    char letter='c';
    for(int i =0;i<charArray.length;i++)
    {
        if(charArray[i]==32)
            continue;

        letter=charArray[i];
        counter=0;
        for(char c : charArray)
        {
            if(letter==c)
            {
                counter++;
            }
        }
        if(counter>maxCount)
        {
            maxCount=counter;
         maxRep=letter;
        }
    }
        System.out.println("Max repeated character is : " + maxRep +" : total repetitive number is " + maxCount);
    }//Max repetitive Character finder,(Space excluded)

    static void Task7_7(Scanner console){
//        7.Cümlə daxil olunacaq (istənilən uzunluqda) və sizdən cümlənin ilk sözünü balaca herflere sonrakı sözü böyük hərflərə
//        ondan sonra balaca herflere..... bu ardıcıllıqla gederek yeni cümleni çap etmeyiniz lazımdır (input outputlara baxın daha aydın olacaq sual)
//
//        1.input-> HTML bir programLAŞdırma dili DeyilDir
//
//        output->html BİR programlaşdırma DİLİ deyildir
//
//        1.input-> sALAM java  dünyasına  xoş gəlmisiniz
//
//        output->salam JAVA dünyasına XOŞ gəlmisiniz
        System.out.println("Task 7_7");
        String result = "";
        System.out.println("Please Enter String to reverse its CASE , opposite of the first Letter \n" +
                "LEtter -> letter || lETTEr -> LETTER");

        String s = console.nextLine();
        String[] stringArray= s.split(" ");
        System.out.println(" Original Case Words - "+Arrays.toString(stringArray));

        for(int i=0;i<stringArray.length;i++){
            char c = stringArray[i].charAt(0);
            if(Character.isUpperCase(c)){
                stringArray[i]=stringArray[i].toLowerCase();
            }else{
                stringArray[i]=stringArray[i].toUpperCase();

            }

        }//Reversing String based on First character Case Upper<-->Lower

        System.out.println("Reversed Case Words - "+Arrays.toString(stringArray));

        result = String.join(" ",stringArray);
        System.out.println( " reversed Cased String - " +result);


    } // (Upper <--> Lower First Character flag) -  Words Case reverser method

}
