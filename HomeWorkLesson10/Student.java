package HomeWork.DivAcademyTimur.HomeWorkLesson10;

import java.time.Year;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String password;
    private int birthYear;
    private int age;
    private String classID;
    private boolean isAdmin;

    public Student()
    {

    }
    public Student(String name, String password,boolean isAdmin)
    {
        this.name=name;
        this.password=password;
        this.isAdmin=isAdmin;
    }
    public Student(String name,String surname,int birthYear,String password)
    {
        this.name=name;
        this.surname=surname;
        this.birthYear=birthYear;
        this.password=password;
        this.isAdmin=isAdmin;
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
    public int getAge() {
        return Year.now().getValue()-birthYear;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
            isAdmin = admin;
         }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {

        return
                "name: " + name  +
                ", surname: " + surname  +
                ", birthYear: " + birthYear +
                ", classID: " + classID +
                ", isAdmin: "  + isAdmin +'\n';
    }


}
