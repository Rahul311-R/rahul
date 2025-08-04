import java.util.Scanner;

class simple{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("your sum is "+(a+b));
        scanner.close();


    }
    
}