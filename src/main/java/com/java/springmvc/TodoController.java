package com.java.springmvc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.java.model.Todo;
import com.java.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {


	@Autowired
	private TodoService  service;


	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}


	@RequestMapping(value = "/todo-list", method = RequestMethod.GET)
	public String retriveTodo(ModelMap model){

		List<Todo> todoList = service.retrieveTodos((String)model.get("name"));
		todoList.forEach(list-> System.out.println("Todo LIst----------" +todoList));

		String name =(String) model.get("name");

		model.addAttribute("list", service.retrieveTodos(name));

		return "todo-list";

	}


	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model){

		//model.put("list", service.retrieveTodos("ansar"));
		model.addAttribute("todo", new Todo());

		return "add-todo";

	}


	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String saveTodo(ModelMap model,@Valid Todo todo,BindingResult result){


		//model.put("list", service.retrieveTodos("ansar"));

		if(result.hasErrors()) {
			return "add-todo";
		}

		service.addTodo((String)model.get("name"), todo.getDesc(), todo.getTargetDate(), false);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:todo-list";

	}


	@RequestMapping(value = "/delete-toto", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam("id") int id,
			ModelMap model){

		System.out.println("ID------" +id);

		service.deleteTodo(id);		

		return "redirect:todo-list";

	}


	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String showUpdateTodo(@RequestParam("id") int id,
			ModelMap model){

		System.out.println("ID------" +id);
		Todo todoById = service.getTodoById(id);
		model.addAttribute("todo", todoById);



		return "update-todo";

	}


	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model,Todo todo){

		System.out.println("ID------" +todo.getId());
		Todo todoById = service.getTodoById(todo.getId());

		todoById.setUser(todo.getUser());
		todoById.setDesc(todo.getDesc());
		todoById.setTargetDate(todo.getTargetDate());
		//todoById.setDone(todo.get)

		service.updateTodo(todoById);

		//model.addAttribute("list", todoById);



		return "redirect:todo-list";

	}



}
