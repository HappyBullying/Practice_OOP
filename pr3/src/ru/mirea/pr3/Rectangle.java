package ru.mirea.pr3;


public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(){}
    Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width+length);
    }

    public String toString(){
        return "Color: " + color + ", Filled: " + filled + ", Width: " + width + ", Length: " + length + ", Perimeter: " +getPerimeter() + ", Area: " + getArea();
    }
}
