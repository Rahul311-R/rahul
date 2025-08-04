public class vowel_cons {
    public static void main(String[] args) {
        String a= ("hello");
        char[] arr=a.toCharArray();
        int vowel=0;
        int cons=0;
        for(char o:arr)
        if(isvowel(o)){
            vowel++;
        }else{
            cons++;
        }
        System.out.println(vowel);
        System.out.println(cons);
    } 
    static boolean isvowel(char v){
        v=Character.toLowerCase(v);
        if(v=='a'||v=='u'||v=='e'||v=='i'||v=='o'){
            return true;
        }

        return false;

    }
}
