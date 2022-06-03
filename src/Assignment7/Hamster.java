package Assignment7;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("Hamster class");
    }

    @Override
    public void eat() {
        System.out.println("The Hamster is eating");
    }

    @Override
    public void swim() {
        System.out.println("The Hamster is swimming");
    }
}
