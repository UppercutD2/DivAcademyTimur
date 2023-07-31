package HomeWork.DivAcademyTimur.LoginSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {


    static List<User> userList= new ArrayList<>();


    static void addUser(User user)
    {
     userList.add(user);
        System.out.println("User " + user.getName()+ ", " + user.getSurname() +" has been added\n");
    }
    static void removeUser(User user)
    {
        System.out.println("User " + user.getName()+ ", " + user.getSurname() +" has been removed");
        userList.remove(user);

    }

     static void print(){
        System.out.println("Details are provided without password");
        for(User user : userList)
        {
            System.out.println( user.toString());

        }

    }//no passwords list print
    static void printWithPasswords(Admin admin,String password)
    {
        if(password.equals(admin.getPassword()))
        {
            for(User user : userList)
            {
                System.out.println(user.toStringWithPassword());
            }
        }
        else
        {
            System.out.println("Wrong admin password entered");
        }
    }


}
