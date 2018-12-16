package ru.mirea.pr1;
import java.lang.String;
import  java.util.*;

public class Dog {
    private String Name;
    private int Age;
    public Dog(String Name, int Age){
        this.Age = Age;
        this.Name = Name;
    }

    public String get_Name(){
        return Name;
    }

    public void set_Name(String Name){
        this.Name = Name;
    }

    public int get_Age(){
        return this.Age;
    }

    public void set_Age(int Age){
        this.Age = Age;
    }

    public int get_Human_Age(){
        return 7*this.Age;
    }

    public String toString(){
        return "Возраст: " + Age + ", Имя:" + Name + ", Человеческих лет: " + Age*7;
    }
}
