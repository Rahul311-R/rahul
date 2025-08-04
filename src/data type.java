import java.util.Scanner;
class demo{
    public static void main(String[] args){
        Scanner va = new Scanner(System.in);
        int n=va.nextInt();
        int d=va.nextInt();
        if(n==d){
            System.out.println("equal tha");
        }else{
            System.out.println("not equal");
        }
    }
}