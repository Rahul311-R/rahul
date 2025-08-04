//user defined input

import java.util.Scanner;
class f{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int sum = 1;
            for(int i=0;i<a;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(sum+" ");
                    sum = sum+1;
                }
                System.out.println();
            }
        }


    }
}

/*own input
class star2 {
    public static void main(String[] args){
        int a=5;
        int sum=1;
        for (int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(sum+" ");
                sum=sum +1;

        }
        System.out.println();
    }

    }
}*/