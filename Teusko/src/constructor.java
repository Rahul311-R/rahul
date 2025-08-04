public class constructor {
    public static void main(String[] args) {
        human obj = new human();
        obj.setname("rahul");
        System.out.println(obj.getname());

    }
}
class human{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
}