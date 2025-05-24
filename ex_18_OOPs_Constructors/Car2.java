package ex_18_OOPs_Constructors;

public class Car2 {
    String model;
    int year;

    //1. Default
    Car2(){
        System.out.println("DC");
    }

    //2. Parameter
    Car2(String model_name, int year_created){
        this.model = model_name;
        this.year = year_created;
    }
}
