package ex_19_OOPs_Part2.accessModifier.police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }

//    public void canIShoot() -> Thief, Cop (All) allow
//    private void canIShoot() -> Cop is allow,but JrCop is not allow, & Thief is not allow

    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }
}
