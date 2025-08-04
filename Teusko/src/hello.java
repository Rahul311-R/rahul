//public class hello
//{
//    public static void main(String [] args){
//        System.out.print("Hello Rahul");
//    }
//
//}

class hello{
    public static void main(String[] args){
        int[] arr ={12,345,2,6,7896};
        int count=0;
        for (int i =0;i<arr.length;i++){
            if(9<arr[i]&&arr[i]<100||arr[i]>999&&arr[i]<10000){
                count++;
            }

        }
        System.out.println(count);
    }
}