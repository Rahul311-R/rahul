class animals{ //original class //parent class
    void eat(){
        System.out.println("Eating....");
    }
}
class Dog extends animals{ //extra added class //child class
    void bark(){
        System.out.println("Barking....");
    }
}
public class inheritance{ //calling the class
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}