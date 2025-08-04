import java.util.Scanner;

public class Mortgage_calcy {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Principal:");
        long p =s.nextLong();
        System.out.println("Rate of interest:");
        int r = s.nextInt();
        System.out.println("period:");
        int n=s.nextInt();
        int d = (int) Math.pow(p,r);
        System.out.println(d);
    }
}
