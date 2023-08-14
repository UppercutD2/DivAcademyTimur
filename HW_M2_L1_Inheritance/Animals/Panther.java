package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals;

public class Panther extends Carnivore{
    @Override
    public String toString() {
        return "Panther{\n" +
                " Name "+this.getName() +"\n" +
                "Health "+this.getHealth()+"\n" +
                "Speed " +this.getSpeed()+"\n" +
                "Danger Level " +this.getDangerLevel()+
                "}";
    }

    public Panther()
    {

    }

    public Panther(String name,int health,int speed,int dangerLevel)
    {
        super(name,health,speed,dangerLevel);
    }

    public void makeRoar()
    {
        System.out.println("Roar - I am Panther.");
    }



}
