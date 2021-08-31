package com.java.springmvc;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Todo;
import com.java.service.TodoService;

@RestController
public class RestApiController {
	
	@Autowired
	private TodoService service;
	
	
	@RequestMapping(value = "/todos/", method = RequestMethod.GET)
	public List<Todo> getAllTodos(){
	
	   return service.retrieveTodos("ansar");
	}
	
	@RequestMapping(value = "/todos/id/{id}", method = RequestMethod.GET)
	public Todo getAllTodos(@PathVariable int id){
		
		
	   return service.getTodoById(id);
	}

}
