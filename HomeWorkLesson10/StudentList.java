package HomeWork.DivAcademyTimur.HomeWorkLesson10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {

     {
        Student admin = new Student("Admin","Admin123",true);
        Student user = new Student("User","User123",false);
        studentList.add(admin);
        studentList.add(user);
    }//initial admin and user to enter the system//////////////////////////////////////////////////////////////////
    private static  List<Student> studentList = new ArrayList<>();

    public static List<Student> getStudentList() {
        return studentList;
    }
    static void seeAllStudent()
    {int index=1;
        for (Student s: studentList)
        {
            System.out.println(index+". "+s);
            index++;
        }
    }//prints all student details without passwords

    static void searchStudentByName(Scanner console)
    {
       List<Student>  list = new ArrayList<>();
        String name = Util.requiredString("Please enter name to Find student : ",console);

        for(Student s: studentList)
        {
            if(s.getName().toLowerCase().contains(name.toLowerCase()))
            {
                list.add(s);
            }
        }//Finds all matches and puts them to separate list

        if(list.size()==0)
        {
            System.out.println("No matches found");
        }//if not matches found Prints message
        else
        {
            for (Student s: list)
            {
                System.out.println(s);
            }
        }//prints all matches

    }//Prints matches of STUDENT search , or message if not matches found
    static boolean loginCheck(String nameInput,String passwordInput)
    {
        for(Student s : studentList)
        {
            String name = s.getName();
            String password = s.getPassword();

            if(nameInput.equalsIgnoreCase(name) && passwordInput.equals(password))
            {
                return true;
            }
        }
        return false;
    }//check name and password with StudentList to approve access

    static void registerNewStudent(Scanner console)
    {   Student student = new Student();
        System.out.println("-----Registration of new Student-----");
        editName(student,console);
        editSurname(student,console);
        editBirthYear(student,console);
        editClassID(student,console);
        editPassword(student,console);
        studentList.add(student);
        System.out.println("\nNew Student has been added\n");
    }

    static boolean adminCheck(Scanner console)
    {
        String admPassword = Util.requiredString("Please insert ADMIN password: ",console);

        for(Student s: studentList)
        {
            if(admPassword.equals(s.getPassword()))
                return s.isAdmin();
        }
        return false;
    }//check admin rights for users

    static void admCheckAndRegister(Scanner console)
    {
        if(adminCheck(console))
        {
            registerNewStudent(console);
        }
        else
        {
            System.out.println("Admin password is incorrect.");
        }

    }//checks admin rights prior registering new Student

    static Student selectStudent(Scanner console)
    {
        seeAllStudent();
        int index = Util.requiredInt("Please select Number of Student to modify: ",console);

        index--;
        if(index<0||index>=studentList.size())
        {
            System.out.println("Wrong number selected.Please try again.");
            return null;
        }else {
            return studentList.get(index);
        }


    }//returns Student based on index input to modify properties
    static void deleteStudent(Scanner console)
    {
        Student student = selectStudent(console);
        if(student.getName().equals("Admin"))
        {
            System.out.println("Admin cannot be deleted");
        }
        else if(studentList.contains(student))
        {
            studentList.remove(student);
        }
    }
    static void editName(Student student,Scanner console)
    {
        if(student.getName()!=null)
        System.out.println("Current name: " + student.getName());

        String name = Util.requiredString("Please insert new Name: ",console);

           if ("Admin".equals(student.getName())) {
               System.out.println("Admin Username Cannot be modified.");
           }//Some restriction to keep Admin always available to login
           else {
               student.setName(name);
               System.out.println("\nName has been updated.\n");
           }

    }
    static void editSurname(Student student,Scanner console)
    {
        if(student.getSurname()!=null)
        System.out.println("Current Surname: " + student.getSurname());

        String surname = Util.requiredString("Please insert new Surname: ",console);
        student.setSurname(surname);
        System.out.println("\nSurname has been updated\n");
    }
    static void editBirthYear(Student student,Scanner console) {
        if(student.getBirthYear()!=0)
        System.out.println("Current Birth Year: " + student.getBirthYear());

        boolean active = true;
        while (active) {
        int birthYear = Util.requiredInt("Please insert new Birth Year: ", console);
        if (birthYear > 2023 || birthYear < 0) {
            System.out.println("Incorrect Year inputted.Try again. ");
        }
        else {
            student.setBirthYear(birthYear);
            active=false;
        }


      }
        System.out.println("\n Birth Year has been updated\n");

    }
    static void editClassID(Student student,Scanner console)
    {
        if(student.getClassID()!=null)
        System.out.println("Current class ID: " + student.getClassID());

        String classID = Util.requiredString("Please insert new Class ID: ", console);
        student.setClassID(classID);
        System.out.println("\nClass ID has been updated\n");
    }
    static void editPassword(Student student,Scanner console)
    {
        if(student.getPassword()!=null)
        System.out.println("Current Password: " + student.getPassword());

        String password = Util.requiredString("Please insert new Password: ",console);

        if("Admin".equals(student.getName()))
        {
            System.out.println("Admin Password Cannot be modified.");
        }//Some restriction to keep Admin always available to login
        else {
            student.setPassword(password);
            System.out.println("\nPassword has been updated\n");
        }
    }
    static void editAdminRights(Student student,Scanner console)
    {
        System.out.println("Current status: " + student.isAdmin());
        String admin = Util.requiredString("Please insert Admin status (true / false): ",console);
        admin = admin.toLowerCase();
        boolean adm = admin.equals("true")?true:false;
        if("Admin".equals(student.getName()))
        {
            System.out.println("Admin Status Cannot be modified.");
        }//Some restriction to keep Admin always available to login
        else
        {
            student.setAdmin(adm);
            System.out.println("Admin rights has been modified.");
        }
    }

}
