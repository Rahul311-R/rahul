import java.util.*;
class ds{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] mark = new int[n];
        int i = 0;
        for (i= 0; i<=5;i++){
            mark[i]= sc.nextInt();
         
        }
        for (i= 0; i<=5;i++){
        System.out.println(mark[i]);
        }
        System.out.println(Arrays.toString(mark));

    }
}