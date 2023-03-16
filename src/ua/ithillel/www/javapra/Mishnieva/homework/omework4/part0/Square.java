package ua.ithillel.www.javapra.Mishnieva.homework.omework4.part0;

public class Square  implements Area {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double areaSquare = a * b;
        System.out.println("The area of the square is equal " + areaSquare + " centimeters");
        return areaSquare;
    }
}
