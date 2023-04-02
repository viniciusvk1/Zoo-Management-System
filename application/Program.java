package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Birds;
import entities.Mammals;
import entities.Reptiles;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Mammals lion = new Mammals("Lion", 5, "Yellow");
        System.out.println(lion.getName()+", "+lion.getAge()+" years, coat collor: "+ lion.getCoatColor());

        Birds eagle = new Birds("Eagle", 3, 2.5);
        System.out.println(eagle.getName()+", "+eagle.getAge()+" years, Wing span: "+ eagle.getWingspan());

        Reptiles snake = new Reptiles("Snake", 2);
        System.out.println(snake.getName()+", "+snake.getAge() + " years.");

        sc.close();
    }
}