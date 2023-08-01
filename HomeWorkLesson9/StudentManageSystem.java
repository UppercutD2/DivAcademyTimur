package HomeWork.DivAcademyTimur.HomeWorkLesson9;

import javax.swing.*;
import java.time.Year;
import java.util.*;

public class StudentManageSystem {
    static  List<Student> studentList = new ArrayList<>();

    static Set<String> emailList = new HashSet<>();


    static boolean checkEmail(String s)
    {
        if(emailList.contains(s.toLowerCase()))
        {
            System.out.println("This Email is already in use.Try another");
            return false;
        }
        else
        {

            return true;
        }

    }
    static void deleteEmail(String s)
    {
        if(emailList.contains(s.toLowerCase()))
        {
            emailList.remove(s);
        }
        else
        {
            System.out.println("Email is not existing");
        }
    }
    public void selectionScreen(Scanner console)
    {
        boolean active = true;
        while (active) {
            System.out.println("------------Student Management System------------------\n" +
                    "Choose option: \n" +
                    "[1] - Registration of new Student \n" +
                    "[2] - See all Students \n" +
                    "[3] - Delete Student\n" +
                    "[0] - Exit program \n");
            String option = console.nextLine();
            switch (option) {
                case "0":
                    System.out.println("Ending program!!!");
                    active=false;
                    break;
                case "1":
                    registration(console);
                    break;
                case "2":
                    print();
                    break;
                case "3":
                    deletion(console);
                    break;
                default:
                    System.out.println("Invalid operation.Please Try again");


            }
        }

    }//Main selection screen loop with methods assigned to options
    static void registration(Scanner console)
    {
        Student student = new Student();
        student.setName(MethodsLesson9.requiredString("Please input name : ",console));
        student.setSurname(MethodsLesson9.requiredString("Please input surname: ",console));
        ageChecker(student,console);
        student.setClassN(MethodsLesson9.requiredString("Please input Class ID: ",console));
        emailRegister(student,console);
        studentList.add(student);
        System.out.println("New Student have been added ");


    }//registration of new Student.Tried to reduce the code
    static void deletion(Scanner console)
    {   if(studentList.size()>0)
        {
            print();
        int number = MethodsLesson9.requiredInt("Please input number of Student to Delete: ",console);

        if(number<1 ||number>studentList.size())
        {
            System.out.println("Invalid number of Student.Please try again");
        }
        else
        {
            number = number -1;
            Student student = studentList.get(number);
            String details = student.toString();
            String mail = student.getEmail();
            deleteEmail(mail);
            studentList.remove(student);
            System.out.printf("\nStudent \"%s\" -- HAS BEEN REMOVED!\n",details);

        }
    }
    else
    {
        System.out.println("No Students have been added.");
    }
    }//Deletion of student from studentList and Email set, with last printing details
    static void emailRegister(Student student,Scanner console)
    {
        boolean active =true;
        while(active)
        {
            String email = MethodsLesson9.requiredString("Please Enter Email: ",console);

            if(checkEmail(email))
            {
                student.setEmail(email);
                emailList.add(email.toLowerCase());
                active=false;
            }

        }


    }//Checker of unique email addresses
    static void ageChecker(Student student, Scanner console)
    {   int year = Year.now().getValue();
        boolean active = true;
        while(active)
        {
            int birthYear = MethodsLesson9.requiredInt("Please input Birth Year: ",console);
            if(birthYear>2023)
            {
                System.out.println("Are you joking with me?Please input correct Birth Year");
                continue;
            }
           int age =year-birthYear;
            if(age<18)
            {
                System.out.println("Student have to be over 18. Please input correct BirthDate");
            }
            else if(age>100)
            {
                System.out.println("SPECIAL NOTE : You look good for your age :-) ");
                student.setBirthYear(birthYear);
                active=false;
            }
            else
            {
                student.setBirthYear(birthYear);
                active=false;
            }
        }


    }//some age checker, personal addition//Considered wrong input format of BirthDate
    static void print()
    {
        if(studentList.size()==0)
        {
            System.out.println("No Students has been added");
        }
        else
        {
            for(Student s :studentList)
            {
                System.out.println(s.toString());
            }

        }

    }//Prints all details of Student

}
