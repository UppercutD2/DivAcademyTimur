package HomeWork.DivAcademyTimur.HomeWorkLesson10;

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.Finishings;
import java.util.List;
import java.util.Scanner;

public class StudentRegisterSystem {



    static  void initialLoginScreen(Scanner console)
    {boolean active =true;

        while(active) {
            System.out.println("------------------------Login------------------");
            String name = Util.requiredString("Please insert Username: ",console);
            String password = Util.requiredString("Please insert password: ",console);

            boolean check = StudentList.loginCheck(name,password);
            List<Student> list = StudentList.getStudentList();

            for(Student s : list)
            {
                if(name.toLowerCase().equals(s.getName().toLowerCase()))
                    name=s.getName();
            }


            if(check){
                System.out.println("----- Welcome, " + name+" -----");
                active =false;
            }
            else
            {
                System.out.println("\nUsername or Password are incorrect. Please try again\n");
            }

        }

    }//login SCREEN , checks username and password


    static void run(Scanner console){
            initialLoginScreen(console);
            mainMenu(console);
      } //here will bee all methods to run through app


    static void mainMenu(Scanner console)
    {
        boolean active = true;
        while(active) {
            System.out.println("==========Student Register System==========\n\n" +
                    "[1] - See all Students\n" +
                    "[2] - Search Student with name\n" +
                    "[3] - Register new Student (only Admin)\n" +
                    "[4] - Update Student (only Admin)\n" +
                    "[5] - Delete Student (only Admin)\n" +
                    "[6] - Log out\n" +
                    "[0] - Exit program\n");
            String option = Util.requiredString("Choose option: ",console);

            switch (option) {
                case "0":
                    System.exit(0);
                case "1":
                    StudentList.seeAllStudent();
                    break;
                case "2":
                    StudentList.searchStudentByName(console);
                    break;
                case "3":
                    StudentList.admCheckAndRegister(console);
                    break;
                case "4":
                    admCheckAndUpdateStudentInfo(console);
                    break;
                case "5":
                    admCheckAndDeleteStudent(console);
                    break;
                case "6":
                    active=false;
                    break;
                default:
                    System.out.println("Wrong option selected. please try again");


            }
        }

    }

    static void updateStudentInfo(Scanner console)
    {   Student student = StudentList.selectStudent(console);
        System.out.println(student);
        boolean active = true;
        while(active)
        {
            System.out.println(student);
            System.out.println("=========User properties modification==========\n" +
                    "[1] - Name\n" +
                    "[2] - Surname\n" +
                    "[3] - Birth Year\n" +
                    "[4] - Password\n" +
                    "[5] - Class ID\n" +
                    "[6] - Admin rights\n" +
                    "[0] - Cancel\n");

            String option=Util.requiredString("Choose option: ",console);
            switch(option)
            {
                case "0":
                    active=false;
                    break;
                case "1":
                    StudentList.editName(student,console);
                    break;
                case "2":
                    StudentList.editSurname(student,console);
                    break;
                case "3":
                    StudentList.editBirthYear(student,console);
                    break;
                case "4":
                    StudentList.editPassword(student,console);
                    break;
                case "5":
                    StudentList.editClassID(student,console);
                    break;
                case "6":
                    StudentList.editAdminRights(student,console);
                    break;
                default:
                    System.out.println("Wrong operation selected.Please try again");

            }
        }

    }//all properties can be updated except "Admin" name,password and status to keep system available in emergency

    static void admCheckAndUpdateStudentInfo(Scanner console)
    {
        boolean check = StudentList.adminCheck(console);
        if(check)
        {
            updateStudentInfo(console);
        }

    }
    static void admCheckAndDeleteStudent(Scanner console)
    {
        boolean check = StudentList.adminCheck(console);
        if(check)
        {
            StudentList.deleteStudent(console);
        }
        else
        {
            System.out.println("Invalid Admin password");
        }
    }



}
