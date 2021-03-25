package com.company;

public class Main {

    public static void main(String[] args) {
	    TimeSpan tSAdd1 = new TimeSpan(1, 20);
        TimeSpan tSAdd2 = new TimeSpan(0, 55);
        tSAdd1.add(tSAdd2);
        System.out.println("TS1 add TS2: " + tSAdd1.toString());

        TimeSpan tSSub1 = new TimeSpan(1, 20);
        TimeSpan tSSub2 = new TimeSpan(0, 55);
        tSSub1.sub(tSSub2);
        System.out.println("TS1 sub TS2: " + tSSub1.toString());

        TimeSpan tSMulti = new TimeSpan(1, 20);
        tSMulti.mult(0.5);
        System.out.println("TS1 multi 0.5: " + tSMulti.toString());
    }
}
