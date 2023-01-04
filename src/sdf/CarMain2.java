package sdf;

public class CarMain2 {

    public static void main(String[] args) {
        Porsche p = new Porsche();

        Car c = new Porsche("yellow", "s1234z");

        System.out.printf(">>>> c.registration: %s, %s\n"
            , c.getRegistration(), c.getColour());

        p = (Porsche)c;
        p.accelerate();

        System.out.printf(">>>> p.registration: %s, %s\n"
            , p.getRegistration(), p.getColour());

        c = new Car();
        if (c instanceof Porsche) {
            System.out.println("You have a Porche");
            p = (Porsche)c; 
            p.accelerate();
        } else {
            System.out.println("You car is not a Porche");

        }
    }
}