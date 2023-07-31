package HomeWork.DivAcademyTimur.LoginSystem;


import java.util.Scanner;

public class Main {

    static Admin admin = new Admin("Admin","Admin","admin@gmail.com","admin123","333");
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        selectActions(console);



    }
    static void createUser( Scanner console){



            System.out.println("Enter name for User ");
            String name = console.nextLine();
            System.out.println("Enter Surname for User ");
            String surname = console.nextLine();
            System.out.println("Enter Email for User ");
            String email = console.nextLine();
            System.out.println("Enter password for User ");
            String password = console.nextLine();
            System.out.println("Enter Mobile phone for User ");
            String mobileNumber=console.nextLine();
            User user = new User(name,surname,email,password,mobileNumber);

            UserList.addUser(user);

    }//Create users based on number inputed

    static void selectActions(Scanner console) {
        boolean exit = true;
        while (exit) {
            System.out.println("\nPlease select operation \n\n" +
                    "show All details of users without password - 1\n" +
                    "show ALL details of users PASSWORD included(Admin password required) - 2\n" +
                    "Edit User List- 3\n" +
                    "Exit programm - 0 \n" +
                    "");
            String option =console.nextLine();


            switch(option)
            {
                case "0":
                    System.out.println("Programm Stopped");
                    exit=false;
                    break;
                case "1":
                    if(UserList.userList.size()==0)
                    {
                        System.out.println("No users has been added");
                        break;
                    }
                    else {
                        UserList.print();
                        break;
                    }

                case "2":
                    if(UserList.userList.size()==0)
                    {
                        System.out.println("No users has been added");
                        break;
                    }
                    else {

                        System.out.println("Please enter admin password to view passwords of users");
                        UserList.printWithPasswords(admin, console.nextLine());
                        break;
                    }
                case "3":
                    editUserList(console);
                    break;

                default:
                    System.out.println("Something went wrong, Please try again or contact your admin");
                    break;
            }

        }
    }

    static void editUserList(Scanner console)
    {
        System.out.println("Some features require admin password \n" );
        boolean exit=true;
        while(exit){

            System.out.println();
            System.out.println("Select option : \n" +
                    "Add user - 1\n" +
                    "Remove user(adm) - 2\n" +
                    "Select User to modify Properties -3\n" +
                    "Return  -0");

                String option = console.nextLine();




                switch(option)
                {
                    case "0":
                        System.out.println("Returning to Main Menu");
                        exit=false;
                        break;
                    case "1":
                        createUser(console);
                        break;
                    case "2":
                        System.out.println("To continue enter admin password");
                        String adminpsw = console.nextLine();
                        boolean checked = adminpsw.equals(admin.getPassword());
                        if(checked)
                        {
                            if (UserList.userList.size() == 0)
                            {
                                System.out.println("No users exists");
                                break;
                            }
                            else
                            {
                                UserList.print();
                                System.out.println("Input Users index to delete");
                                int index = console.nextInt();
                                console.nextLine();
                                if(index>=0&&index<UserList.userList.size())
                                {
                                    User user = UserList.userList.get(index);
                                    UserList.removeUser(user);
                                    break;
                                }
                                else
                                {
                                    System.out.println("Wrong User index selected");
                                    break;
                                }
                        }
                        }else {
                            System.out.println("Wrong admin password entered");
                            break;
                        }//Remove user conditions
                    case "3":
                        if(UserList.userList.size()==0){
                            System.out.println("No users added ");
                            break;
                        }

                        UserList.print();
                        System.out.println("Input Users index to modify");
                        int index = console.nextInt();
                        console.nextLine();
                        if(index>=0&&index<UserList.userList.size())
                        {
                            User user = UserList.userList.get(index);
                            ModifyUserProperties(user,console);
                            break;
                        }
                        else
                        {
                            System.out.println("Wrong User index selected");
                            break;
                        }


                    default:
                        System.out.println("Something went wrong, Please try again or contact your admin");
                            break;
                }//Option with user features.

            }
        }


        static void ModifyUserProperties(User user, Scanner console)
        {
            boolean exit = true;
            while (exit)
            {


                System.out.println("Please select operation \n " +
                        "show ALL details of users PASSWORD included(Admin password required)  - 1\n" +
                        "Edit name - 2\n" +
                        "Edit Surname - 3\n" +
                        "Edit Email - 4\n" +
                        "Change Password - 5\n" +
                        "Edit Mobile Number - 6\n" +
                        "Return - 0 \n" +
                        "");
                    String option = console.nextLine();
                    switch(option)
                    {
                        case "0":
                            System.out.println("Returning to previous menu");
                            exit=false;
                            break;
                        case "1":
                            System.out.println("Enter Admin password to review all details");
                            String psw = console.nextLine();
                            if(adminCheck(psw))
                            {
                                System.out.println(user.toStringWithPassword());
                                break;
                            }
                            else
                            {
                                System.out.println("Invalid admins password.Contact your admin");
                                break;
                            }//Review all details, admin password required
                        case "2":
                            System.out.println("Current name - " + user.getName());
                            System.out.print("New name - ");
                            user.setName(console.nextLine());
                            System.out.println("\nUsername has been changed to " + user.getName());
                            break;
                        case "3":
                            System.out.println("Current Surname - " + user.getSurname());
                            System.out.print("New Surname - " );
                            user.setSurname(console.nextLine());
                            System.out.println("\nSurname has been changed to "+user.getSurname());
                            break;
                        case "4":
                            System.out.println("Current Mail - " + user.getEmail());
                            System.out.print("New Email - " );
                            user.setEmail(console.nextLine());
                            System.out.println("Email has been changed to " + user.getEmail());
                            break;

                        case "5":
                            user.setPassword(console);
                            break;
                        case "6":
                            System.out.println("Current Mobile Number - " + user.getMobileNumber());
                            System.out.println("New Mobile Number - " );
                            user.setMobileNumber(console.nextLine());
                            System.out.println("\nMobile number has been changed to " + user.getMobileNumber());
                            break;
                        default:
                            System.out.println("Something went wrong.Try again or contact your admin");
                    }


            }

        }

        static boolean adminCheck(String password)
        {
            return password.equals(admin.getPassword());
        }

    }

