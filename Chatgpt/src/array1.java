public class array1 {
    public static void main(String[] args) {
        int[] arr = {10,20,1000,4,50};
        int min=arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
