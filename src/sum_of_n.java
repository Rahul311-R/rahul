import java.util.Scanner;

public class sum_of_n {
    static int sum(int n){
        int sum = n * (n + 1) / 2; // Using the formula

        return sum ;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        int res = sum(n);
   System.out.println(res);
    }
}
