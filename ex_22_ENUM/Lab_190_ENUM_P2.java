package ex_22_ENUM;

public class Lab_190_ENUM_P2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);

        if(URLS.katalon.equals("katalon")){
            System.out.println("I want to do something");
        }
    }
}

enum URLS{
    google, restassured, katalon, vwo
}