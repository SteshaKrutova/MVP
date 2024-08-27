package com.geekbrains.view;

import java.util.Scanner;

public class ConsoleUT implements View{
    private Scanner scanner;

    @Override
    public void start() {
        while (true){
            System.out.println("1. Добаивть человека");
            System.out.println("2. Отсортировать по имени");
            System.out.println("3. Отсортировать по возрасту");
            System.out.println("4. Список смеи");
            System.out.println("5. Закончить работу");
        }
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
