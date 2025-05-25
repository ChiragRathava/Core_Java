package ex_19_OOPs_Part2.ecap.realExample;

public class Lab_171 {
    public static void main(String[] args) {

        ICICIBank chirag = new ICICIBank("chirag",100);
//        System.out.println(chirag.bal); // not possible because of private
        System.out.println(chirag.getBal());

        chirag.setBal(1000,false);

        boolean isCashier = true;
        chirag.setBal(1000,isCashier);
        System.out.println(chirag.getBal());

        System.out.println(chirag.bank_name);
    }
}

class ICICIBank{

    private String name;
    private long bal;
    public String bank_name = "ICICI";


    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier){this.bal = bal;}
        else{
            System.out.println("Not allowed to change the Bal");
        }
    }
}
