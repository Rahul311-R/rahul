import java.util.*;
public class mosh5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the time:");
        int t = s.nextInt();
        if (t>9 && t<11 ){
            System.out.println("Active");

        }else if(t>11 && t<15){
            System.out.println("sleepy");
        }else{
            System.out.println("happy");
        }
    }
}
