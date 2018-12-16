package ru.mirea.pr3;

public class Shapetest {

    public static void main(String[] args){
        Circle first = new Circle(5.0, "Red", true);
        Square second = new Square(4, "Blue", false);
        Rectangle third = new Rectangle(1,2, "Brown", true);

        first.setRadius(8);
        System.out.println(first.getArea());
        System.out.println(first.getPerimeter());
        System.out.println(first.getColor());
        System.out.println(first.isFilled());
        System.out.println(first.toString());

        second.setLength(3);
        second.setSied(14);
        System.out.println(second.getSied());
        System.out.println(second.toString());


        third.setLength(33);
        third.setWidth(0.5);
        System.out.println(third.getArea());
        System.out.println(third.getLength());
        System.out.println(third.getPerimeter());
        System.out.println(third.toString());
    }
}
