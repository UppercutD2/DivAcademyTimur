package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Zoo;

import HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals.*;
import HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Util;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Zoo {

    List <Cage> zooCages = new ArrayList<>();



    public List<Cage> getZooCages()
    {
        return this.zooCages;
    }
       void addAnimal(Animal animal)
    {
        Cage cage = new Cage().cageAnimal(animal);
        zooCages.add(cage);
        System.out.println(animal.getName() + " Has been added to the Zoo");
    }

     public void initialZooMenu(Scanner console)
    {boolean isActive = true;
        while(isActive) {
            System.out.println("========== ZOOPARK ==========\n" +
                    "[1] - Show List of Animals\n" +
                    "[2] - Add Animal\n" +
                    "[0] - Exit Zoo\n" +
                    "==============================\n");
            int option = Util.requiredInt("Choose an option: ", console);

            switch (option) {
                case 0:
                    System.exit(0);
                case 1:
                    showListOfAnimals();
                    break;
                case 2:
                    createAnimal(console);
                    break;
                default:
                    System.out.println("Wrong option.Please try again");

            }
        }
    }

     void  showListOfAnimals()
    {
        System.out.println("==========List of All Cages in Zoo==========\n");
        int index=1;
        if(zooCages.size()==0)
            System.out.println("No cages and Animal are added");

        for(Cage c:zooCages)
        {
            if(c.getAnimalInCage()!=null) {
                System.out.print("Cage[" + index + "] - " + c.getAnimalInCage().toString());
                System.out.println("---------------");
                index++;
            }
            else
            {
                System.out.print("Cage[" + index + "] - is Empty");
                System.out.println("---------------");
                index++;
            }


        }
    }//Shows animal in cage numbers


     void createAnimal(Scanner console)
    {   boolean isActive = true;
        while(isActive) {
            System.out.println("Select animal to add to the Zoo\n" +
                    "[1] - Monkey\n" +
                    "[2] - Bear\n" +
                    "[3] - Panther\n" +
                    "[4] - Buffalo\n" +
                    "[0] - return to Main menu");
            int option = Util.requiredInt("Choose option: ", console);

            switch(option)
            {
                case 0:
                    isActive=false;
                    break;
                case 1:
                    addMonkey(console);
                    break;
                case 2:
                    addBear(console);
                    break;
                case 3:
                    addPanther(console);
                    break;
                case 4:
                    addBuffalo(console);
                    break;
                default:
                    System.out.println("Wrong choice of operation.Try again.");


            }
        }

    }//Opton to create an animal

     void addMonkey(Scanner console)
    {
        Monkey monkey = new Monkey(
                Util.requiredString("Name for the Monkey: ",console),
                Util.requiredInt("Number of monkeys HP: ",console),
                Util.requiredInt("Speed of the Monkey: ",console)
        );
        addAnimal(monkey);
    }
     void addBear(Scanner console)
    {
        Bear bear = new Bear(
                Util.requiredString("Name for the Bear: ",console),
                Util.requiredInt("Number of Bear HP: ",console),
                Util.requiredInt("Speed of the Bear: ",console),
                Util.requiredInt("Danger Level of this Bear: ",console)
        );
        addAnimal(bear);
    }
     void addPanther(Scanner console)
    {
        Panther panther = new Panther(
                Util.requiredString("Name for the Panther: ",console),
                Util.requiredInt("Number of Panther HP: ",console),
                Util.requiredInt("Speed of the Panther: ",console),
                Util.requiredInt("Danger Level of this Panther: ",console)
        );
        addAnimal(panther);
    }
     void addBuffalo(Scanner console)
    {
        Bufallo buffalo = new Bufallo(
                Util.requiredString("Name for the Buffalo: ",console),
                Util.requiredInt("Number of Buffalo HP: ",console),
                Util.requiredInt("Speed of the Buffalo: ",console)
        );
        addAnimal(buffalo);
    }

}
