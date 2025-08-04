//user defined input
import java.util.Scanner;
class uyt{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n;i>0;i--){
            for (int j=n;j>i;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}



//own input
//class jh{
//    public static void main(String[]args){
//        int n=6;
//        for(int i=n;i>0;i--){
//            for (int j=n;j>i;j--){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }
//}