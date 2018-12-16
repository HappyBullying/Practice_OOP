package ru.mirea.pr5_v2;

public class main {
    public static void main(String[] args){
        show(6,0);
    }

    public static void show(int n, int k){
        if (k < n){
            k++;
            System.out.println(k);
            show(n,k);
        }

    }
}
