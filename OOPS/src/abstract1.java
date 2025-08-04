abstract class Shape{ 
    abstract void draw();//just define but no func inside
}
class circle extends Shape{
    void draw(){ //altered class
        System.out.print("drawing circle");
    }

}
public class abstract1{
    public static void main(String[] args) {
        Shape shape = new circle();
        shape.draw();
    }
}