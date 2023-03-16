package ua.ithillel.www.javapra.Mishnieva.homework.homework4.part0;

public class Square  implements Area {

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        double areaSquare = length * width;
        System.out.println("The area of the square is equal " + areaSquare + " centimeters");
        return areaSquare;
    }
}
