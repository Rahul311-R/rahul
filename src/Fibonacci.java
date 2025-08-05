public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Find the 10th Fibonacci number
        int a = 0, b = 1;

        if(n == 1) {
            System.out.println(a);
        } else if(n == 2) {
            System.out.println(b);
        } else {
            int c = 0;
            for(int i = 2; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b); // b holds the nth Fibonacci number
        }
    }
}
