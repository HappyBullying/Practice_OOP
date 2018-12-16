package ru.mirea.pr7;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public  static void main(String[] args){
        LinkedList Player1 = new LinkedList();
        LinkedList Player2 = new LinkedList();

        ((LinkedList) Player1).add(3);
        ((LinkedList) Player1).add(7);
        ((LinkedList) Player1).add(1);
        ((LinkedList) Player1).add(5);
        ((LinkedList) Player1).add(9);

        ((LinkedList) Player2).add(4);
        ((LinkedList) Player2).add(8);
        ((LinkedList) Player2).add(2);
        ((LinkedList) Player2).add(6);
        ((LinkedList) Player2).add(0);

        int first = 0, second = 0, counter  = 0;

        while(Player1.size() != 0 && Player2.size() != 0){
            first = (int)(Player1).poll();
            second = (int)(Player2).poll();

            if (first < second) {
                ((LinkedList) Player1).add(first);
                ((LinkedList) Player1).add(second);
            } else {
                ((LinkedList) Player2).add(second);
                ((LinkedList) Player2).add(first);
            }
            ++counter;
            if (counter == 106)
                break;
        }
        System.out.println("Число ходов: "+ counter);
        if (counter == 106)
            System.exit(0);
        if (((LinkedList)Player1).isEmpty())
            System.out.println("Выиграл второй");
        else
            System.out.println("Выиграл первый");





    }
}
