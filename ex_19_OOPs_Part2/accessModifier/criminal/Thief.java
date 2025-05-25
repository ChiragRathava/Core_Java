package ex_19_OOPs_Part2.accessModifier.criminal;

import ex_19_OOPs_Part2.accessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
//        thief.canIShoot(); // he is not in the same folder
    }
}
