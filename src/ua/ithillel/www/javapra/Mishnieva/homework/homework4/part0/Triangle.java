package ua.ithillel.www.javapra.Mishnieva.homework.homework4.part0;

public class Triangle implements Area {
    private int base;
    private int height;

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        double areaTriangle = (base * height)/2;
        System.out.println("The area of the triangle is equal " + areaTriangle + " centimeters");
        return areaTriangle;
    }
}
