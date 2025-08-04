class car { //inga tha class define pandraga
    String color; //attribute
    int maxspeed; //attribute
    void output(){
        System.out.print("color: "+ color + " And MaxSpeed: "+maxspeed); //return statement
    }
}

public class classes{ //calling function
    public static void main(String[]args){
        car mycar = new car(); //creating new variable to call class
        mycar.color = "purple";
        mycar.maxspeed = 450;
        mycar.output();

    }
}