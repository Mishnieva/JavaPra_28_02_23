package ua.ithillel.www.javapra.Mishnieva.homework.omework4.part0;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        double[] array = {new Square(2, 5).area(), new Сircle(2).area(), new Triangle (6,3).area()};

        double sum = 0;
        for (double arrays : array) {
            sum += arrays;
        }
        System.out.println();
        String doubleSum = new DecimalFormat("#0.00").format(sum);
        System.out.println("Area of all figures = " + doubleSum + " centimeters");
    }
}