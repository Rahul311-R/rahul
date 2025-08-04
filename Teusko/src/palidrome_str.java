import java.util.Scanner;

public class palidrome_str {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a= s.nextLine();
        boolean ispalidrome = ispalidrome(a);
        if(ispalidrome){
            System.out.println("it is palidrome");
        }else{
            System.out.println("it is not a palidrome");
        }
    }
    static boolean ispalidrome(String n){
        int i=0,j=n.length() -1;
        while(i<j){
            if(n.charAt(i)!=n.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
