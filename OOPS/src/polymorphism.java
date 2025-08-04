class animal{ //1 method
    void sound(){
        System.out.print("Animal sound");
    }
}
class cat extends animal{ //2 method
    @Override
    void sound(){
        System.out.print("Woof");
    }
}
public class polymorphism{
    public static void main(String[] args) {
        animal MyDog = new cat();
        MyDog.sound();

    }
}