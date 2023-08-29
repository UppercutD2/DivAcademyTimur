package HomeWork.DivAcademyTimur.HW_M2_L5_LocalDateTime;

import HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        task15_5(console);
    }


    public static void task15_1(Scanner console){
        LocalDate birthDate = inputLocalDate(console);
        LocalDate present = LocalDate.now();

        int age = (int) ChronoUnit.YEARS.between(birthDate,present);
        System.out.println("Current age is: " + age + " years old" );
    }

    public static void task15_2(Scanner console){
        LocalTime time1 = inputLocalTime(console);
        LocalTime time2 = inputLocalTime(console);
        System.out.println( "Time1 //  " + time1);
        System.out.println( "Time2 //  " + time2);

        LocalTime result = getDurationBetween(time1,time2);
        System.out.println(result);
    }
    public static void task15_3()
    {

        LocalDate date1 = LocalDate.now();
        System.out.println("Current Date: " + date1);
        LocalTime time1 = LocalTime.now();
        System.out.println("Current Time: " + time1);

        LocalDateTime dateTime1 = LocalDateTime.now();

        System.out.println(dateTime1);
    }

    public static void task15_4()
    {
        LocalDateTime dateTime1 = LocalDateTime.now();

        LocalDateTime plusYear = dateTime1.plus(1,ChronoUnit.YEARS);
        LocalDateTime minusYear = dateTime1.minus(1,ChronoUnit.YEARS);
        System.out.println("Current DateTime: "+ dateTime1);
        System.out.println("Plus One Year DateTime: " + plusYear);
        System.out.println("Minus One Year DateTime: " + minusYear);

    }
    public static void task15_5(Scanner console)
    {
            LocalDate date1 = inputLocalDate(console);
            LocalDate date2 = inputLocalDate(console);

            long days = Math.abs(ChronoUnit.DAYS.between(date1,date2));
        System.out.println(days);
    }



    //////////////////////Supportive Methods///////////////////////////

    public static LocalTime inputLocalTime(Scanner console)
    {
        System.out.println("Inputs should be numbers only!!!");
        int hours = Util.requiredInt("Enter Hr (0-24) : ",console);
        int minutes = Util.requiredInt("Enter Minutes (0-59): ",console);
        int seconds = Util.requiredInt("Enter Seconds (0-59): ",console);


        return LocalTime.of(hours,minutes,seconds);

    }



    public static LocalTime getDurationBetween(LocalTime time1,LocalTime time2)
    {   Duration duration = null;
        if(time1.isAfter(time2)) {

             duration = Duration.between(time2,time1);
        }
        else{
             duration = Duration.between(time1,time2);
        }
        int hr = duration.toHoursPart();
        int minutes = duration.toSecondsPart();
        int seconds = duration.toSecondsPart();

        return LocalTime.of(hr,minutes,seconds);
    }




    public static LocalDate inputLocalDate(Scanner console)
    {
        System.out.println("Inputs should be numbers only!!!");
        int year = Util.requiredInt("Enter  Year: ",console);
        int month = Util.requiredInt("Enter  Month: ",console);
        int day = Util.requiredInt("Enter  Day: ",console);

        return LocalDate.of(year,month,day);

    }
}
