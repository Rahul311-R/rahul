import java.util.*;
class hello{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n%3==0 && n%5==0){
            System.out.println("Buzz Fizz");
        }else if (n%3==0){
            System.out.println("Buzz");
        }
        else if(n%5==0){
        System.out.println("Fizz");}
        else{
        System.out.println(0);}

    }
}