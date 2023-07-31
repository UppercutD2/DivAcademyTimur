package HomeWork.DivAcademyTimur.LoginSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Admin {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String mobileNumber;

    public Admin()
    {

    }
    public Admin(String name,String surname,String email,String password,String mobileNumber)
    {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.mobileNumber=mobileNumber;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {

       return this.password;
    }
    public void deleteUser(User user)
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter admin password to delete User - " +user.getName()+", " + user.getSurname());
        System.out.println("Enter \"Exit\" to break deletion");
        int attempt =3;
        while(true)
        {
            String psw = console.nextLine();
            if(psw.equalsIgnoreCase("Exit"))
                break;

            if (this.password.equals(psw)) {
                user = null;
                break;
            }
            else
            {
                attempt--;
                System.out.println("Admin password wrong. "+attempt + " attempts left");

            }
            if(attempt==0)
            {
                System.out.println("No more attempts. Contact Admin");
                break;
            }
        }

    }//Delete user with Admin password
}
