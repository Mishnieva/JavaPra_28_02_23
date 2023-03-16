package ua.ithillel.www.javapra.Mishnieva.homework.homework4.part0;

public class Triangle implements Area {
    private int a;
    private int h;

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        double areaTriangle = (a * h)/2;
        System.out.println("The area of the triangle is equal " + areaTriangle + " centimeters");
        return areaTriangle;
    }
}
