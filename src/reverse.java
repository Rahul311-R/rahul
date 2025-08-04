import java.util.Scanner;
class ij{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int number[] = new int[5] ;
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        for (int i=number.length-1; i>=0 ; i--){
            System.out.print(number[i]+" ");
        }
    }
}




/*
public class iuhd {
    public static void main(String[]args){
    int number[]={10,20,30,40,50};
    for (int i=0;i<number.length;i++){
        System.out.print(number[i]+" ");
    }
    System.out.println();
    for (int i=number.length-1; i>=0 ; i--){
        System.out.print(number[i]+" ");

    }
}
}*/
