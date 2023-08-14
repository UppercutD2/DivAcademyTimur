package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals;

public class Monkey extends Herbivore{

    public Monkey()
    {

    }

    public Monkey(String name,int health,int speed)
    {
        super(name,health,speed);
    }


    public void climb()
    {

        System.out.println( this.getName() + " - I am climbing!!!");
    }
    @Override
    public String toString() {
        return "Monkey{\n" +
                " Name "+this.getName() +"\n" +
                "Health "+this.getHealth()+"\n" +
                "Speed " +this.getSpeed()+"\n" +
                "}";
    }

}
