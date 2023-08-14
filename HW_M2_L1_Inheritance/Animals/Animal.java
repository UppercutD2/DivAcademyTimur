package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals;

public abstract class Animal {



    private String name;


    private int health;
    private int speed;



    Animal()
    {

    }
    Animal(String name,int health,int speed)
    {
        this.name = name;
        this.health = health;
        this.speed=speed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }







}
