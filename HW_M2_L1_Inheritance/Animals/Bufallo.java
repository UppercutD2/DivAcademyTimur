package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals;

public class Bufallo extends Herbivore{


    public Bufallo()
    {

    }

    public Bufallo(String name,int health,int speed)
    {
        super(name,health,speed);
    }
    public void bufalloHi()
    {
        System.out.println("Hi from Bufallo");
    }
    @Override
    public String toString() {
        return "Buffalo{\n" +
                " Name "+this.getName() +"\n" +
                "Health "+this.getHealth()+"\n" +
                "Speed " +this.getSpeed()+"\n" +
                "}";
    }
}
