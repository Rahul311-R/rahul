import java.util.Scanner;

class stu{
    int age;
    int reg;
}
class uy87{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        stu student1 = new stu();

    
        student1.age = 19;
        student1.reg = 12;
        System.out.println("Age: " + student1.age);
        System.out.println("Registration Number: " + student1.reg);
    }
}