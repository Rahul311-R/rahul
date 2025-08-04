public class encap{
    public static void main(String[] args) {
        rahul var=new rahul();
        var.name("rahul");
        var.age(21);
        System.out.println(var.get()+" "+var.tell());
    }
}

class rahul{
    private String name;
    private int age;

    public String get(){
        return name;
    }
    public void name(String name){
        this.name =name;
    }
    public int tell(){
        return age;
    }
    public void age(int age){
        this.age=age;
    }

}