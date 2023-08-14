package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals;

public class Bear extends Carnivore{


    public Bear()
    {

    }

    public Bear(String name,int health,int speed,int dangerLevel)
    {
        super(name,health,speed,dangerLevel);
    }

    @Override
    public String toString() {
        return "Bear{\n" +
                " Name "+this.getName() +"\n" +
                "Health "+this.getHealth()+"\n" +
                "Speed " +this.getSpeed()+"\n" +
                "Danger Level " +this.getDangerLevel()+
                "}";
    }
}
