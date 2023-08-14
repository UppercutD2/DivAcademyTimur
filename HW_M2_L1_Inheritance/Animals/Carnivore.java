package HomeWork.DivAcademyTimur.HW_M2_L1_Inheritance.Animals;

public abstract class Carnivore extends Animal{


    Carnivore(){

    }
    Carnivore(String name,int health,int speed,int dangerLevel)
    {
        super(name,health,speed);
        this.dangerLevel=dangerLevel;
    }


    private int dangerLevel;

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

}
