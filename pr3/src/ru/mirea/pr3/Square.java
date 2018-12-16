package ru.mirea.pr3;

public class Square extends Rectangle {

    private double sied;
    Square(){}
    Square(double side){
        this.sied = side;
    }
    Square(double sied, String color, boolean filled){
        this.sied = sied;
        this.color = color;
        this.filled = filled;
    }

    public double getSied(){
        return sied;
    }

    public void setSied(double sied){
        this.sied = sied;
    }

    public  void setWidth(double width){
        this.sied = width;
    }

    public void setLength(double length){
        this.sied = length;
    }

    public String toString(){
        return "Side is: " + sied + ", Color is: " + color + "Filled: " + filled;
    }
}
