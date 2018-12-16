package ru.mirea.pr3;

public class Circle extends Shape {
    private  double radius;
    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "Radius: " + radius + ", Color: " + color + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
