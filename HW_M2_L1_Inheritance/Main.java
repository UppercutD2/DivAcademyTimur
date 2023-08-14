package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance;

import HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals.Animal;
import HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals.Monkey;
import HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Zoo.Zoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Zoo zoo=new Zoo();
            zoo.initialZooMenu(console);
    }
}
