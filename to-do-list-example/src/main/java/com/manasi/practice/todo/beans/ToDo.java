package com.manasi.practice.todo.beans;

public class ToDo {
    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
    int id;
    String description;
    // constructor has type of data that is required
    public ToDo(int id, String description) {
        // initialize the input variable from main
        // function to the global variable of the class
        this.id = id;
        this.description = description;
    }
}
