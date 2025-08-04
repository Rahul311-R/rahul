 import java.util.*;
 class wed{
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int sum=0;
         for (int i = a;i<=b;i=i+1){
             if (i%2==1){
                
                 sum = sum+1;
            
             }
         }
         System.out.println(sum);
     }
 }


 class fde{
     public static void main (String[]args){
         for (int i=1;i<=100;i++){
             if (i%3==0&&i%5==0){
                 System.out.println(i);
             }
         }
     }
 }