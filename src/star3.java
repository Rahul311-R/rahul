//user defined input

import java.util.Scanner;
class star3 {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for (int i=0; i<n;i++){
                for(int j=0;j<n;j++){
                    if(j==0||j==n/2||j==n-1){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
    }
}

/*own input
class we{
    public static void main(String[]args){
        int u=5;
        for (int i=0;i<u;i++){
            for (int j=0;j<u;j++){
                if(j==0||j==u/2||j==u-1){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }    
            }
            System.out.println();
        }
    }
}
*/