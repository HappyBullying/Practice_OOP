package ru.mirea.pr5;

public class main {
    public static void main(String[] args){
        rec(0, 6);
    }

    private static void rec(int num, int bord){
        if(num < bord){
        num++;
        for(int i = 1; i <= num; i++)
            System.out.println(num);
        rec(num, bord);
    }
}}
