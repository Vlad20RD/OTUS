package com.otus.homework;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag){
            System.out.println("Выберит команду add/list/exit");
            String s = sc.next().trim().toLowerCase(Locale.ROOT);
            CommandMenu commands = CommandMenu.valueOf(s);

            switch (commands){
                case add:
                    Animal animal = null;
                    boolean flagAnimalType = true;

                    while (flagAnimalType) {
                        System.out.println("Какое животное добавить(cat/dog/duck)?");
                        String animalType = sc.next().trim().toLowerCase(Locale.ROOT);

                        if (animalType.equals("dog")) {
                            animal = new Dog();
                            generateAnimal(animal, sc);
                            flagAnimalType = false;
                        } else if (animalType.equals("cat")) {
                            animal = new Cat();
                            generateAnimal(animal, sc);
                            flagAnimalType = false;
                        } else if (animalType.equals("duck")) {
                            animal = new Duck();
                            generateAnimal(animal, sc);
                            flagAnimalType = false;
                        } else {
                            System.out.println("Выберите животное из списка!!!");
                        }
                    }
                    animalList.add(animal);
                    break;

                case list:
                    int i = 1;
                    for (Animal a : animalList) {
                        System.out.println(i +") Животное: " + a.toString());
                    }
                    break;

                case exit:
                    System.out.println("До свидания!!!");
                    flag = false;
                    break;

                default:
                    System.out.println("Такой команды нет");
                    break;
            }
        }
    }

    public static void generateAnimal(Animal animal, Scanner scanner){
        System.out.println("Введите имя:");
        animal.setName(scanner.next().trim());
        System.out.println("Введите цвет:");
        animal.setColor(scanner.next().trim().toLowerCase(Locale.ROOT));
        System.out.println("Введите возраст:");
        animal.setAge(scanner.nextInt());
        System.out.println("Введите вес:");
        animal.setWeight(scanner.nextDouble());
    }
}