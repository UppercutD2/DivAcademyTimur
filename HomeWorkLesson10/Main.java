package HomeWork.DivAcademyTimur.HomeWorkLesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student_CRUD_System();
    }
    static void Student_CRUD_System(){
        Scanner console = new Scanner(System.in);
        StudentList list = new StudentList();
        while(true)
        {
            StudentRegisterSystem.run(console);
        }
    }
}
