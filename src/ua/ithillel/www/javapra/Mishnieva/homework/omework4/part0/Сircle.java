package ua.ithillel.www.javapra.Mishnieva.homework.omework4.part0;

import java.text.DecimalFormat;

public class Сircle implements Area {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Сircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double areaCircle = (Math.PI * Math.pow(radius, 2));
        String doublearea = new DecimalFormat("#0.00").format(areaCircle);
        System.out.println("The area of the circle is equal " + doublearea + " centimeters");
        return areaCircle;
    }
}
