package ex_21_Static;

public class Lab_187_Real {
    public static void main(String[] args) {
        ATB1 a = new ATB1();
        a.getName();
    }

}

class ATB1{
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose?
        // Here you can write code related to
        // start a website or anything before stating the
        // web automation or api automation
    }
    static {
        System.out.println("Load the class ?, I will execute");
    }

    private String name;
    private String phone;
    static String course_name = "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocumets(){
        System.out.println("Non Static Method");
        System.out.println(course_name);
    }

    static void doAssignment(){
//        System.out.println(phone); // Static method can't access the non static variable
        System.out.println("Do Assignment");
    }
}
