package Assignment7;

public class Mouse extends Rodent{
    public Mouse(){
        System.out.println("Mouse class");
    }
    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    public void swim() {
        System.out.println("Mouse is swimming");
    }
}
