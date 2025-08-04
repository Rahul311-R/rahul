//user defined input
import java.util.Scanner;
class d{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}


/*own input
class f{
    public static void main(String[] args){
        int c=5;
        for (int i=1;i<=c;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/