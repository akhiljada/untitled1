package Assignment7;

public class Demo {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[4];

        rodent[0] = new Mouse();
        rodent[1] = new Gebril();
        rodent[2] = new Hamster();
        rodent[3] = new Mouse();

        rodent[0].eat();
        rodent[1].swim();
        rodent[2].eat();
        rodent[3].swim();
    }
}
