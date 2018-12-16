package ru.mirea.pr3;

public class Shape {
    protected String color;
    protected boolean filled;
    Shape(){}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return  "Цвет: " + color + ", Filled: " + filled;
    }
}
