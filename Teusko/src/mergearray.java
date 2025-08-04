public class mergearray {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};

        int[] merge=new int[a.length+b.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            merge[index++]=a[i];
        }
        for (int i=0;i<b.length;i++){
            merge[index++]=b[i];
        }
        for (int num:merge){
            System.out.print(num+" ");
        }
    }
}
