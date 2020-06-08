package com.manasi.practice.todo;

import com.manasi.practice.todo.beans.ToDo;
import com.manasi.practice.todo.utils.ToDoOperations;

import java.util.List;
import java.util.Scanner;

public class ToDoDemo {
    static final Scanner scanner = new Scanner(System.in);
    static final ToDoOperations toDoOperations = new ToDoOperations();

    public static void main(String[] args) {
        int input = 1;
        do {
            System.out.println("please provide input");
            System.out.println("1 -Insert");
            System.out.println("2 -Delete");
            System.out.println("3 -Display");
            System.out.println("4 -Quit");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    insertToDo();
                    break;
                case 2:
                    deleteToDo();
                    break;
                case 3:
                    displayToDo();
                    break;
                case 4:
                    break;
            }
        } while (input != 4);
    }

    private static void displayToDo() {
        List<ToDo> list = toDoOperations.display();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void deleteToDo() {
        System.out.println("Enter ID");
        int id = scanner.nextInt();  // Read user input
        toDoOperations.remove(id);
    }

    private static void insertToDo() {
        System.out.println("Enter ID");
        int id = scanner.nextInt();  // Read user input
        System.out.println("Enter Description");
        String description = scanner.next();  // Read user input
        toDoOperations.add(new ToDo(id, description));
    }
}
