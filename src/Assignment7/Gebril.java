package Assignment7;

public class Gebril extends Rodent{
    public Gebril(){
        System.out.println("Gebril class");
    }

    @Override
    public void eat() {
        System.out.println("The Gebril is eating");
    }

    @Override
    public void swim() {
        System.out.println("The Gebril is swimming");
    }
}
