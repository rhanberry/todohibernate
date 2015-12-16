package todospringboot.services;

import java.util.List;

import todospringboot.entities.TodoList;

public interface TodoService {

	List<TodoList> getTodolists(Boolean complete);

	void add(TodoList todolist);

	void update(TodoList todolist);

	TodoList getByTodoId(Integer todoId) throws InvalidInputException;
	
	
	
	void delete(Integer todoId);

	
}