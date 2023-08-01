package HomeWork.DivAcademyTimur.HomeWorkLesson9;

import java.time.Year;

public class Student {
    private String name;
    private String surname;

    private int birthYear;
    private String classN;
    private String email;
    private static int year = Year.now().getValue();
  //  private int age = year-birthYear;//Cannot use this variable in toStringMethod.Talk to Elcan about it.

    public Student()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getClassN() {
        return classN;
    }

    public void setClassN(String classN) {
        this.classN = classN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
           this.email=email;
    }

    @Override
    public String toString() {
        int index =StudentManageSystem.studentList.indexOf(this);
        index++;

        return index+".Name Surname : " + name  +
                ", " + surname+
                "\n  class :  " + classN+
                "\n  Age : " + (year-this.birthYear)
                ;//still have questions with age. Please remind to talk to you about it.
    }
}
