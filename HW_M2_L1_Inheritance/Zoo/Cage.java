package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Zoo;


import HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals.Animal;

public class Cage {


    private Animal animal;
    private String details;




   public  Cage cageAnimal(Animal animal)
    {
        this.animal = animal;
        System.out.println(animal.getName() + " has been caged.");
        return this;
    }

    public Animal getAnimalInCage()
    {
        return this.animal;
    }

    public String CageDetails()
    {
        if(animal!=null)
        {
            return animal.toString();
        }
        else
        {
            return "No animal in this cage";
        }
    }



}
