package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Please specify the number of elements in the list: ");

        int numberOfElements = input.nextInt();

        for (int i = 1; i <= numberOfElements; i++) {
            numbersList.add(i);
        }
        System.out.print("The numbers stored in the list are: ");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }
        int sum1 = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            sum1 = sum1 + numbersList.get(i);
        }
        System.out.print("\n");

        int random = (int) ((Math.random() * numbersList.size())); //din internet

        numbersList.remove(random); // sau manual exemlu: numbersList.remove(index:2);

        System.out.print("The numbers stored in the list 2 are: ");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }
        System.out.print("\n");

        int sum2 = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            sum2 = sum2 + numbersList.get(i);
        }
        int number = 0;
        number = sum1 - sum2;
        System.out.println("The missing number is: " + number);
    }
}