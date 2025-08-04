//user input

import java.util.*;
class th{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int og = a;
       int rev = 0;
       while(a!=0){
           rev = rev * 10 + a % 10;
           a = a / 10;
       }
       if(rev==og){
       System.out.println("palidrome");}
       else{
       System.out.println("not palindrome");}
    }
}


/*own input
class suma{
    public static void main(String[] args){
       int a = 121;
       int og = a;
       int rev = 0;
       while(a!=0){
           rev = rev * 10 + a % 10;
           a = a / 10;
       }
       if(rev==og){
       System.out.println("palidrome");}
       else{
       System.out.println("not palindrome");}
    }
}*/