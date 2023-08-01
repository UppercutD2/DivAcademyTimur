package HomeWork.DivAcademyTimur.HomeWorkLesson9;

import java.util.Scanner;

public class Flashlight {

    private boolean isOn = false;

    public void getStatus(){
        if(isOn)
        {
            System.out.println("Flashlight is ON");
        }
        else
        {
            System.out.println("Flashlight if OFF");
        }
    }//Gets status of Flashlight with message

    public void switchButton()
    {   if(isOn)
    {
        System.out.println("Turning OFF the Flashlight");
        this.isOn=!isOn;
    }else
    {
        System.out.println("Turning ON the Flashlight");
        this.isOn=!isOn;
    }

    }//switcher with messages
    void selectionScreen(Scanner console)
    {
        boolean active =true;
        while(active) {
            System.out.println("\n\n-------Simple Flashlight Switcher-----------\n" +
                    "Choose option: \n" +
                    "[1] - Check status of Flashlight\n" +
                    "[2] - Flashlight button (ON / OFF)\n" +
                    "[0] - Exit program");
            String option = console.nextLine();


            switch (option) {
                case "0":
                    System.out.println("Ending program");
                    active=false;
                    break;
                case "1":
                    getStatus();
                    break;
                case "2":
                    switchButton();
                    break;
                default:
                    System.out.println("Invalid operation.Please try again");

            }
        }
    }//cycle for Flashlight operations

}
