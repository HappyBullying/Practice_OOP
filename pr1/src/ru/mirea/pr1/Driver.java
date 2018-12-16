package ru.mirea.pr1;

public class Driver {
    public static void main(String[] args){
        Dog Akita = new Dog("Kate", 9);
        Akita.set_Age(5);
        Akita.set_Name("Andy");
        System.out.println(Akita.get_Age());
        System.out.println(Akita.get_Name());
        System.out.println(Akita.toString());
    }
}
