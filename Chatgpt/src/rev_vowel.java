import java.util.Scanner;

class rev_vowel{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(a);
        System.out.print(rev(a));
    }
    static String rev(String a){
        char[] arr = a.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            while(i<j && !vowel(arr[i])){
                i++;
            }
            while(i<j && !vowel(arr[j])){
                j--;
            }
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    static boolean vowel(char c){
        c= Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='u'||c=='o');
    }
}