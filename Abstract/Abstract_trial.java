package Abstract;
abstract class Animal{
    void sound(){
        System.out.println("bark");
    }
}
 class Donkey{
    void eat()
    {
        System.out.println("i am eating");
    }
    void sleep(){
        System.out.println("i am sleeping");
    }

}
public class Abstract_trial{
    public static void main(String[] args) {
        Animal cat = new Animal() {
            void sound(){
                System.out.println("meow");
            }
        };
        cat.sound();
        Donkey d1 = new Donkey(){
            void eat(){
                System.out.println(" I am anonymous class");
            }
            
        };
        d1.eat();

    }
}