package com.manasi.practice.todo.dao;

import com.manasi.practice.todo.beans.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoRepository {

    List<ToDo> list = new ArrayList<ToDo>();

    public void add(ToDo toDo) {
        list.add(toDo);
    }

    public void remove(int id) {
        ToDo todo = list.get(id);
        list.remove(todo);
    }

    public List<ToDo> display() {
        return list;
    }
}

