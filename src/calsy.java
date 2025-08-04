import java.util.Scanner;

public class calsy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        var a= s.nextInt();
        var b=s.nextInt();
        char c=s.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (b!=0) {
                    System.out.println(a / b);
                    break;
                }
                else{
                    System.out.println("not divided");
                    break;
                }
        }
    }
}

