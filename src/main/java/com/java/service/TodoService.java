package com.java.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.model.Todo;

@Service
public class TodoService {

	public static List<Todo> list = new ArrayList<>();

	public static int todoCount = 4;

	static {
		list.add(new Todo(1, "ansar", "software Enginner", new Date(), false));
		list.add(new Todo(2, "ansar", "software Enginner", new Date(), false));
		list.add(new Todo(3, "ansar", "software Enginner", new Date(), false));
		list.add(new Todo(4, "shalu", "software Enginner", new Date(), false));
	}

	public void addTodo(String name, String desc, Date date, boolean isdone) {

		list.add(new Todo(++todoCount, name, desc, date, isdone));

	}

	public void deleteTodo(int id) {

		Iterator<Todo> iterator = list.iterator();

		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}

	}

	public List<Todo> retrieveTodos(String user) {

		List<Todo> todoList = new ArrayList<>();

		for (Todo todo : list) {
			if (todo.getUser().equalsIgnoreCase(user)) {
				todoList.add(todo);

			}

		}
		return todoList;
	}

	public Todo getTodoById(int id) {

		for (Todo todo : list) {
			if (todo.getId() == id) {
				return todo;
			}

		}

		return null;
	}
	
	public  Todo updateTodo(Todo todo) {
		
		list.remove(todo);
		list.add(todo);
		
		return todo;
	}

}
