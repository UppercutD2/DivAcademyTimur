package HomeWork.DivAcademyTimur.LoginSystem;


import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String mobileNumber;

    public User()
    {

    }
    public User(String name,String surname,String email,String password,String mobileNumber)
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

    public void setPassword(Scanner console) {

        if(this.password==null)
        {
            System.out.println("Enter new password");
            this.password=console.nextLine();
        }
        else
        {
            System.out.println("Enter current Users password :");
            String psw = console.nextLine();
            if(this.password.equals(psw))
            {
                System.out.println(" input new password :");
                String psw1=console.nextLine();
                System.out.println("Please repeat your new password");
                String psw2=console.nextLine();
                if(psw1.equals(psw2))
                {
                    System.out.println("Password changed , Press enter to continue");
                    this.password = console.nextLine();

                }
                else
                {
                    System.out.println("Mismatch in new Passwords.please Try again");
                }
            }
            else
            {
                System.out.println("Users password wrong.Contact admin");
            }
        }
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String toStringWithPassword() {


            return "User{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", mobileNumber='" + mobileNumber + '\'' +
                    '}';

    }//shows  data with password

    @Override
    public String toString() {
        int index = UserList.userList.indexOf(this);
        return "User index "+index+"{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\''  +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }//show data without password
}
