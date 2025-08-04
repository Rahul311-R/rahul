import java.util.Scanner;
class summa{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i =1;
            for (i=1;i<=10;i++){
                int mul=n*i;
                System.out.println(i+"*"+n+"="+mul);
            }
        }
    }
}