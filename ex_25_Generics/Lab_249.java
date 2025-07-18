package ex_25_Generics;

public class Lab_249 {

    public static void main(String[] args) {

        Test<Integer> i1 = new Test<Integer>(5);
        System.out.println(i1.getObject());

        Test<Double> i2 = new Test<Double>(5.2);
        System.out.println(i2.getObject());

        Test<String> i3 = new Test<String>("Chirag");
        System.out.println(i3.getObject());

    }
}

class Test <T> {
    T obj;
    Test(T obj) { this.obj = obj; }
    public T getObject(){ return this.obj; }
}
